package juego;

import javax.swing.JLabel;

public class Zombies {

    CrearEscenario crea = new CrearEscenario();

    private int zombieX;
    private int zombieY;

    public void poszombie() {

        zombieX = (int) Math.floor(Math.random() * 18 + 1);
        zombieY = (int) Math.floor(Math.random() * 18 + 1);

    }

    public void genzombie(JLabel[][] escenario, int[][] escMatriz) {

        this.poszombie();

        if (escMatriz[zombieX][zombieY] != Contenedor.bossD) {
            if (escMatriz[zombieX][zombieY] != Contenedor.bossI) {
                if (escMatriz[zombieX][zombieY] != Contenedor.muro) {
                    if (escMatriz[zombieX][zombieY] != Contenedor.moneda) {
                        if (escMatriz[zombieX][zombieY] != Contenedor.municion) {
                            if (escMatriz[zombieX][zombieY] != Contenedor.muroR) {
                                escenario[zombieX][zombieY].setIcon(crea.obtenerImagen(Contenedor.zombieI));

                                escMatriz[zombieX][zombieY] = Contenedor.zombieI;

                                escenario[zombieX][zombieY].setIcon(crea.obtenerImagen(Contenedor.zombieI));
                            }
                        }
                    }
                }
            }
        }

    }

    public void genzombie2(JLabel[][] escenario, int[][] escMatriz) {

        this.poszombie();

        if (escMatriz[zombieX][zombieY] != Contenedor.bossD) {
            if (escMatriz[zombieX][zombieY] != Contenedor.bossD) {
                if (escMatriz[zombieX][zombieY] != Contenedor.muro) {
                    if (escMatriz[zombieX][zombieY] != Contenedor.moneda) {
                        if (escMatriz[zombieX][zombieY] != Contenedor.municion) {
                            if (escMatriz[zombieX][zombieY] != Contenedor.muroR) {
                                escenario[zombieX][zombieY].setIcon(crea.obtenerImagen(Contenedor.zombieD));

                                escMatriz[zombieX][zombieY] = Contenedor.zombieD;

                                escenario[zombieX][zombieY].setIcon(crea.obtenerImagen(Contenedor.zombieD));
                            }
                        }
                    }

                }
            }
        }
    }

}
