package juego;

import java.awt.Image;
import java.io.FileNotFoundException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javazoom.jl.decoder.JavaLayerException;

/**
 *
 * @author aquinoacordero
 */
public class Disparo {

    CrearEscenario crea = new CrearEscenario();
    int x;
    int y;
    boolean colision;
    int distancia = 8;
    
    ReproducirDisparo playD = new ReproducirDisparo();

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    int contBalas;

    public Disparo(int personajeX, int personajeY) {

        this.x = personajeX;
        this.y = personajeY;

    }

    public void movdisparo(JLabel[][] escenario, int[][] escMatriz, JPanel panelEscenario,
            boolean arriba, boolean abajo, boolean derecha, boolean izquierda) throws FileNotFoundException, JavaLayerException, InterruptedException {

        if (arriba == true) {

            for (int p = 1; p < distancia; p++) {
                System.out.println("Posicion bala X" + x);
                System.out.println("Posicion bala Y" + y);

                if (escMatriz[x][y - p] == Contenedor.muro) {
                    playD.sonidoDispM();
                    p = 8;
                }
                if (escMatriz[x][y - p] == Contenedor.zombieD) {
                    escMatriz[x][y - p] = Contenedor.sueloSangre;
                    escenario[x][y - p].setIcon(crea.obtenerImagen(Contenedor.sueloSangre));
                    p = 8;
                }
                if (escMatriz[x][y - p] == Contenedor.zombieI) {
                    escMatriz[x][y - p] = Contenedor.sueloSangre;
                    escenario[x][y - p].setIcon(crea.obtenerImagen(Contenedor.sueloSangre));
                    p = 8;
                }

            }
        }
        if (abajo == true) {

            for (int p = 1; p < distancia; p++) {
                System.out.println("Posicion bala X" + x);
                System.out.println("Posicion bala Y" + y);

                if (escMatriz[x][y + p] == Contenedor.muro) {
                    playD.sonidoDispM();
                    p = 8;
                } else if (escMatriz[x][y + p] == Contenedor.zombieD) {
                    escMatriz[x][y + p] = Contenedor.sueloSangre;
                    escenario[x][y + p].setIcon(crea.obtenerImagen(Contenedor.sueloSangre));
                    p = 8;
                } else if (escMatriz[x][y + p] == Contenedor.zombieI) {
                    escMatriz[x][y + p] = Contenedor.sueloSangre;
                    escenario[x][y + p].setIcon(crea.obtenerImagen(Contenedor.sueloSangre));
                    p = 8;
                }

            }
        }
        if (derecha == true) {

            for (int p = 1; p < distancia; p++) {
                System.out.println("Posicion bala X" + x);
                System.out.println("Posicion bala Y" + y);

                if (escMatriz[x + p][y] == Contenedor.muro) {
                    playD.sonidoDispM();
                    p = 8;
                } else if (escMatriz[x + p][y] == Contenedor.zombieD) {
                    escMatriz[x + p][y] = Contenedor.sueloSangre;
                    escenario[x + p][y].setIcon(crea.obtenerImagen(Contenedor.sueloSangre));
                    p = 8;
                } else if (escMatriz[x + p][y] == Contenedor.zombieI) {
                    escMatriz[x + p][y] = Contenedor.sueloSangre;
                    escenario[x + p][y].setIcon(crea.obtenerImagen(Contenedor.sueloSangre));
                    p = 8;
                }

            }

        }
        if (izquierda == true) {

            for (int p = 1; p < distancia; p++) {
                System.out.println("Posicion bala X" + x);
                System.out.println("Posicion bala Y" + y);

                if (escMatriz[x - p][y] == Contenedor.muro) {
                    playD.sonidoDispM();
                    p = 8;
                } else if (escMatriz[x - p][y] == Contenedor.zombieD) {
                    escMatriz[x - p][y] = Contenedor.sueloSangre;
                    escenario[x - p][y].setIcon(crea.obtenerImagen(Contenedor.sueloSangre));
                    p = 8;
                } else if (escMatriz[x - p][y] == Contenedor.zombieI) {
                    escMatriz[x - p][y] = Contenedor.sueloSangre;
                    escenario[x - p][y].setIcon(crea.obtenerImagen(Contenedor.sueloSangre));
                    p = 8;
                }

            }
        }

    }

    public int cargador(int contBalas) {

        if (contBalas > 0) {
            contBalas--;

        } else {
            /*while(label_bala!=null){
             //label_bala.setBounds(escenario[personajeX][personajeY]+40,escenario[personajeX][personajeY]+20 10, 10);
             }*/
            JOptionPane.showMessageDialog(null, "NO HAY MUNICION");
        }
        System.out.println(contBalas);
        return contBalas;
    }

}
