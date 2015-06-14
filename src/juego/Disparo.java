package juego;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import javazoom.jl.decoder.JavaLayerException;

/**
 *
 * @author aquinoacordero
 */
public class Disparo {

    int x;
    int y;
    int cons;
    boolean colision;
    int distancia = 8;
    static boolean ban = true;

    Reproducir playD = new Reproducir();
    CrearEscenario crea = new CrearEscenario();

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    int contBalas;

    public Disparo(int personajeX, int personajeY, int consistencia) {

        this.cons = consistencia;
        this.x = personajeX;
        this.y = personajeY;

    }

    public int movdisparo(final JLabel[][] escenario, int[][] escMatriz, JPanel panelEscenario,
            boolean arriba, final boolean abajo, boolean derecha, boolean izquierda) throws FileNotFoundException, JavaLayerException, InterruptedException {

        if (arriba == true) {

            for (int p = 1; p < distancia; p++) {
                System.out.println("Posicion bala X" + x);
                System.out.println("Posicion bala Y" + y);

                if (escMatriz[x][y - p] == Contenedor.muro) {
                    playD.sonidoDispM();
                    p = 8;
                } else if (escMatriz[x][y - p] == Contenedor.muroR) {
                    playD.sonidoDispM();
                    cons--;
                    if (cons == 0) {
                        cons = 3;
                        escMatriz[x][y - p] = Contenedor.muroP;
                        escenario[x][y - p].setIcon(crea.obtenerImagen(Contenedor.muroP));
                    }
                    p = 8;
                } else if (escMatriz[x][y - p] == Contenedor.zombieD) {
                    playD.sonidoZombie();
                    escMatriz[x][y - p] = Contenedor.sueloSangre;
                    escenario[x][y - p].setIcon(crea.obtenerImagen(Contenedor.sueloSangre));
                    p = 8;
                } else if (escMatriz[x][y - p] == Contenedor.zombieI) {
                    playD.sonidoZombie();
                    escMatriz[x][y - p] = Contenedor.sueloSangre;
                    escenario[x][y - p].setIcon(crea.obtenerImagen(Contenedor.sueloSangre));
                    p = 8;
                }

            }
        }
        if (abajo == true) {
            //escenario[x][y].setIcon(new ImageIcon(getClass().getResource("/Imagenes/PAb.gif")));

            for (int p = 1; p < distancia; p++) {
                System.out.println("Posicion bala X" + x);
                System.out.println("Posicion bala Y" + y);

                if (escMatriz[x][y + p] == Contenedor.muro) {
                    playD.sonidoDispM();
                    p = 8;
                } else if (escMatriz[x][y + p] == Contenedor.muroR) {
                    playD.sonidoDispM();
                    cons--;

                    if (cons == 0) {
                        cons = 3;
                        escMatriz[x][y + p] = Contenedor.muroP;
                        escenario[x][y + p].setIcon(crea.obtenerImagen(Contenedor.muroP));
                    }
                    p = 8;
                } else if (escMatriz[x][y + p] == Contenedor.zombieD) {
                    playD.sonidoZombie();
                    escMatriz[x][y + p] = Contenedor.sueloSangre;
                    escenario[x][y + p].setIcon(crea.obtenerImagen(Contenedor.sueloSangre));
                    p = 8;
                } else if (escMatriz[x][y + p] == Contenedor.zombieI) {
                    playD.sonidoZombie();
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
                } else if (escMatriz[x + p][y] == Contenedor.muroR) {
                    System.out.println(cons);
                    playD.sonidoDispM();
                    cons--;

                    if (cons == 0) {
                        cons = 3;
                        escMatriz[x + p][y] = Contenedor.muroP;
                        escenario[x + p][y].setIcon(crea.obtenerImagen(Contenedor.muroP));
                    }
                    p = 8;
                } else if (escMatriz[x + p][y] == Contenedor.zombieD) {
                    playD.sonidoZombie();
                    escMatriz[x + p][y] = Contenedor.sueloSangre;
                    escenario[x + p][y].setIcon(crea.obtenerImagen(Contenedor.sueloSangre));
                    p = 8;
                } else if (escMatriz[x + p][y] == Contenedor.zombieI) {
                    playD.sonidoZombie();
                    escMatriz[x + p][y] = Contenedor.sueloSangre;
                    escenario[x + p][y].setIcon(crea.obtenerImagen(Contenedor.sueloSangre));
                    p = 8;
                }

            }

        }
        if (izquierda
                == true) {

            for (int p = 1; p < distancia; p++) {
                System.out.println("Posicion bala X" + x);
                System.out.println("Posicion bala Y" + y);

                if (escMatriz[x - p][y] == Contenedor.muro) {
                    playD.sonidoDispM();
                    p = 8;
                } else if (escMatriz[x - p][y] == Contenedor.muroR) {
                    playD.sonidoDispM();
                    cons--;

                    if (cons == 0) {
                        cons = 3;
                        escMatriz[x - p][y] = Contenedor.muroP;
                        escenario[x - p][y].setIcon(crea.obtenerImagen(Contenedor.muroP));
                    }
                    p = 8;
                } else if (escMatriz[x - p][y] == Contenedor.zombieD) {
                    playD.sonidoZombie();
                    escMatriz[x - p][y] = Contenedor.sueloSangre;
                    escenario[x - p][y].setIcon(crea.obtenerImagen(Contenedor.sueloSangre));
                    p = 8;
                } else if (escMatriz[x - p][y] == Contenedor.zombieI) {
                    playD.sonidoZombie();
                    escMatriz[x - p][y] = Contenedor.sueloSangre;
                    escenario[x - p][y].setIcon(crea.obtenerImagen(Contenedor.sueloSangre));
                    p = 8;
                }

            }
        }
        return cons;
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
