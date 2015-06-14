package juego;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javazoom.jl.decoder.JavaLayerException;

public class Controles extends JFrame implements ActionListener {

    //JFrame marco = new JFrame();
    int opc;
    JLabel flecha1, flecha2, flecha3, flecha4, espacio, esc, id, aab, esp, es;
    JButton volver;

    public void controles() {

        flecha1 = new JLabel();
        flecha2 = new JLabel();
        flecha3 = new JLabel();
        flecha4 = new JLabel();
        espacio = new JLabel();
        esc = new JLabel();
        es = new JLabel();
        esp = new JLabel();
        id = new JLabel();
        aab = new JLabel();
        volver = new JButton();

        getContentPane().setLayout(null);
        setTitle("CONTROLES");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/IconoG.png")).getImage());
        setLocationRelativeTo(null);
        setBackground(Color.white);
        setSize(300, 300);
        setVisible(true);

        getContentPane().add(flecha1);
        flecha1.setBounds(15, 20, 40, 40);
        flecha1.setIcon(new ImageIcon(getClass().getResource("/Imagenes/flecha1.png")));
        getContentPane().add(flecha2);
        flecha2.setBounds(55, 20, 40, 40);
        flecha2.setIcon(new ImageIcon(getClass().getResource("/Imagenes/flecha2.png")));
        getContentPane().add(id);
        id.setBounds(100, 10, 200, 60);
        id.setText("Movimiento izquierda -- derecha");
        getContentPane().add(flecha3);
        flecha3.setBounds(15, 60, 40, 40);
        flecha3.setIcon(new ImageIcon(getClass().getResource("/Imagenes/flecha3.png")));
        getContentPane().add(flecha4);
        flecha4.setBounds(55, 60, 40, 40);
        flecha4.setIcon(new ImageIcon(getClass().getResource("/Imagenes/flecha4.png")));
        getContentPane().add(aab);
        aab.setBounds(100, 50, 200, 60);
        aab.setText("Movimiento abajo -- arriba");
        getContentPane().add(espacio);
        espacio.setBounds(15, 100, 40, 40);
        espacio.setIcon(new ImageIcon(getClass().getResource("/Imagenes/espacio.png")));
        getContentPane().add(esp);
        esp.setBounds(100, 90, 200, 60);
        esp.setText("Disparar");
        getContentPane().add(esc);
        esc.setBounds(15, 140, 40, 40);
        esc.setIcon(new ImageIcon(getClass().getResource("/Imagenes/esc.png")));
        getContentPane().add(es);
        es.setBounds(100, 130, 200, 60);
        es.setText("Salir");
        getContentPane().add(volver);
        volver.setBounds(110, 180, 100, 40);
        volver.setText(" VOLVER ");
        volver.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        try {
            Menu menu = new Menu(opc);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Controles.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JavaLayerException ex) {
            Logger.getLogger(Controles.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(Controles.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
