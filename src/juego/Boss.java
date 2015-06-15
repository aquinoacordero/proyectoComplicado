package juego;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javazoom.jl.decoder.JavaLayerException;

public class Boss {

    int contVida;
    CrearEscenario crea = new CrearEscenario();
    Reproducir playD = new Reproducir();
    
    private int bossX = 18;
    private int bossY = 11;

    public void posBoss(JLabel[][] escenario, int[][] escMatriz) {

        bossX = bossX - 1;
        bossY = 11;
        if (bossX == 0) {
            escenario[bossX + 1][bossY].setIcon(crea.obtenerImagen(Contenedor.suelo));
            escMatriz[bossX + 1][bossY] = Contenedor.suelo;
            bossX = 17;

        }
    }

    public int genBoss(JLabel[][] escenario, int[][] escMatriz, int contVida) {

        this.posBoss(escenario, escMatriz);

        if (escMatriz[bossX][bossY] != Contenedor.personajeA) {
            if (escMatriz[bossX][bossY] != Contenedor.personajeAb) {
                if (escMatriz[bossX][bossY] != Contenedor.personajeD) {
                    if (escMatriz[bossX][bossY] != Contenedor.personajeI) {
                        escenario[bossX][bossY].setIcon(crea.obtenerImagen(Contenedor.bossI));
                        escMatriz[bossX][bossY] = Contenedor.bossI;
                        escenario[bossX][bossY].setIcon(crea.obtenerImagen(Contenedor.bossI));

                        escenario[bossX + 1][bossY].setIcon(crea.obtenerImagen(Contenedor.suelo));
                        escMatriz[bossX + 1][bossY] = Contenedor.suelo;
                        escenario[bossX + 1][bossY].setIcon(crea.obtenerImagen(Contenedor.suelo));

                    }

                }

            }

        }
        if (escMatriz[bossX - 1][bossY] == Contenedor.personajeA) {
            this.contVida = contVida = 0;
            try {
                playD.sonidoDaño();
            } catch (Exception ex) {
            } 
        }
        if (escMatriz[bossX - 1][bossY] == Contenedor.personajeAb) {
            this.contVida = contVida = 0;
            try {
                playD.sonidoDaño();
            } catch (Exception ex) {
            }
        }
        if (escMatriz[bossX - 1][bossY] == Contenedor.personajeD) {
            this.contVida = contVida = 0;
            try {
                playD.sonidoDaño();
            } catch (Exception ex) {
            }
        }
        if (escMatriz[bossX - 1][bossY] == Contenedor.personajeI) {
            this.contVida = contVida = 0;
            try {
                playD.sonidoDaño();
            } catch (Exception ex) {
            }
        }

        return contVida;

    }
}
