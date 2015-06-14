package juego;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class BaseDatos {
        static Connection con = null;
    static Statement estado;

    public BaseDatos() {
    }

    public static void con() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/Juego", "root", "");
            System.out.println("dentro");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error" + ex);
        }

    }

    public static void insertar(int contador) {
        try {
            BaseDatos.con();
            estado = con.createStatement();
            String nome = JOptionPane.showInputDialog("Introduce un nome");
            estado.executeUpdate("insert into scores values("+"'" + nome + "'," + contador  + ")");
            estado.close();
            con.close();

        } catch (SQLException ex) {
            Logger.getLogger(Escenario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


}
