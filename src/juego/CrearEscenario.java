package juego;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Aitor
 */
public class CrearEscenario {

    CargarMapa map = new CargarMapa();
    int numeros;
    int[][] esc = new int[20][22];

    public CrearEscenario() {

    }

    public int[][] crearEscenario(int opc) {
        esc = map.devMapa(opc);
        return esc;
    }

    public ImageIcon obtenerImagen(int nImg) {
        switch (nImg) {
            case Contenedor.suelo:
                return new ImageIcon(getClass().getResource("/Imagenes/C.png"));
            case Contenedor.sueloSangre:
                return new ImageIcon(getClass().getResource("/Imagenes/CS.png"));
            case Contenedor.muro:
                return new ImageIcon(getClass().getResource("/Imagenes/M.png"));
            case Contenedor.muroR:
                return new ImageIcon(getClass().getResource("/Imagenes/MR.png"));
            case Contenedor.muroP:
                return new ImageIcon(getClass().getResource("/Imagenes/MP.png"));
            case Contenedor.personajeD:
                return new ImageIcon(getClass().getResource("/Imagenes/PD.png"));
            case Contenedor.personajeI:
                return new ImageIcon(getClass().getResource("/Imagenes/PI.png"));
            case Contenedor.personajeA:
                return new ImageIcon(getClass().getResource("/Imagenes/PArr.png"));
            case Contenedor.personajeAb:
                return new ImageIcon(getClass().getResource("/Imagenes/PAb.png"));
            case Contenedor.moneda:
                return new ImageIcon(getClass().getResource("/Imagenes/Moneda.gif"));
            case Contenedor.sigM:
                return new ImageIcon(getClass().getResource("/Imagenes/sigM.gif"));
            case Contenedor.sigX:
                return new ImageIcon(getClass().getResource("/Imagenes/sigX.png"));
            case Contenedor.zombieD:
                return new ImageIcon(getClass().getResource("/Imagenes/ZD.gif"));
            case Contenedor.zombieI:
                return new ImageIcon(getClass().getResource("/Imagenes/ZI.gif"));
            case Contenedor.live:
                return new ImageIcon(getClass().getResource("/Imagenes/L.gif"));
            case Contenedor.bala:
                return new ImageIcon(getClass().getResource("/Imagenes/B.gif"));
            case Contenedor.municion:
                return new ImageIcon(getClass().getResource("/Imagenes/BI.png"));
            case Contenedor.disparo:
                return new ImageIcon(getClass().getResource("/Imagenes/D.png"));
            case Contenedor.bossI:
                return new ImageIcon(getClass().getResource("/Imagenes/bossI.png"));
            case Contenedor.bossD:
                return new ImageIcon(getClass().getResource("/Imagenes/bossD.png"));
            default:
                return new ImageIcon(getClass().getResource("/Imagenes/C.png"));
        }
    }

}
