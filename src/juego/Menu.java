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

public final class Menu implements ActionListener {

    JFrame marco;
    JPanel panel, panelA;
    JLabel label;
    JButton jugar, salir, controles;
    JComboBox mapa;
    int opc;

    Juego juego = new Juego();
    ReproductorIntro play = new ReproductorIntro();
    Controles control = new Controles();

    public Menu(int opc) throws FileNotFoundException, JavaLayerException, InterruptedException {
        this.opc = opc;
        ventana();
    }

    public void ventana() throws FileNotFoundException, JavaLayerException, InterruptedException {

        play.sonido();

        marco = new JFrame();
        panel = new JPanel();
        label = new JLabel();
        label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/zombies.png")));
        jugar = new JButton(" JUGAR ");
        salir = new JButton(" SALIR ");
        controles = new JButton(" CONTROLES ");
        mapa = new JComboBox();

        marco.add(panel);

        panel.add(jugar);
        panel.add(mapa);
        panel.add(salir);
        panel.add(controles);
        panel.add(label);

        mapa.addItem("Mapa 1");
        mapa.addItem("Mapa 2");
        mapa.addItem("Mapa 3");
        mapa.addItem("Mapa 4");

        marco.setSize(400, 400);
        marco.setResizable(false);
        marco.setLocationRelativeTo(null);
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        marco.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/IconoG.png")).getImage());
        marco.setTitle("DUNGEONS && ZOMBIES");
        
        jugar.addActionListener(this);
        salir.addActionListener(this);
        controles.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == jugar) {
            if (mapa.getSelectedItem().equals("Mapa 1")) {
                opc = 1;
            } else if (mapa.getSelectedItem().equals("Mapa 2")) {
                opc = 2;
            } else if (mapa.getSelectedItem().equals("Mapa 3")) {
                opc = 3;
            }else if (mapa.getSelectedItem().equals("Mapa 4")){
                opc = 4;
            }

            try {
                
                marco.setVisible(false);
                juego.ejecutar(opc);
                

            } catch (Exception ex) {

            }
        }else if (e.getSource() == salir){
            System.exit(0);
        }else {
            
            marco.setVisible(false);
            control.controles();
        }
    }

}
