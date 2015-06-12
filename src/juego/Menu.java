package juego;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javazoom.jl.decoder.JavaLayerException;

public class Menu implements ActionListener {

    JFrame marco;
    JPanel panel, panelA, panelB, panelC;
    JLabel label;
    JButton jugar, salir;
    JComboBox mapa;
    JTable tabla;
    JScrollPane scroll;
    DefaultTableModel dtm;
    String[][] datos;
    String[] campos = {"NOMBRE", "APELLIDOS", "CURSO"};
    int opc;

    Juego juego = new Juego();
    ReproductorIntro play = new ReproductorIntro();

    public Menu(int opc){
        this.opc = opc;
    }
    
    public void ventana() throws FileNotFoundException, JavaLayerException, InterruptedException{

        play.sonido();
        

        marco = new JFrame();
        panel = new JPanel();
        label = new JLabel();
        jugar = new JButton(" JUGAR ");
        salir = new JButton(" SALIR ");
        mapa = new JComboBox();

        marco.add(panel);
        panel.add(jugar);
        panel.add(mapa);
        panel.add(salir);
        panel.add(label);

        mapa.addItem("Mapa 1");
        mapa.addItem("Mapa 2");
        mapa.addItem("Mapa 3");

        marco.setSize(400, 400);
        marco.setResizable(false);
        marco.setLocationRelativeTo(null);
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/zombies.png")));

        marco.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/IconoG.png")).getImage());

        jugar.addActionListener(this);
        salir.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (mapa.getSelectedItem().equals("Mapa 1")) {
            opc = 1;
        } else if (mapa.getSelectedItem().equals("Mapa 2")) {
            opc = 2;
        } else if (mapa.getSelectedItem().equals("Mapa 3")) {
            opc = 3;
        }

        try {
            juego.ejecutar(opc);
            marco.setVisible(false);
        } catch (Exception ex) {

        }
    }

}
