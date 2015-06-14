package juego;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class Reproducir {

    static boolean pausa = false;

    public void sonidoDisp() throws FileNotFoundException,
            JavaLayerException, InterruptedException {
        final Player pl = new Player(new FileInputStream(
                "C:/Users/Aitor/Desktop/Programas/proyecto/Juego/src/Sonidos/disparo.mp3"));

        new Thread() {
            @Override
            public void run() {
                try {
                    while (true) {
                        if (!pausa) {
                            if (!pl.play(1)) {
                                break;
                            }
                        }
                    }
                } catch (JavaLayerException e) {
                    e.printStackTrace();
                }
            }
        }.start();

    }

    public void sonidoDispM() throws FileNotFoundException,
            JavaLayerException, InterruptedException {
        final Player pl = new Player(new FileInputStream(
                "C:/Users/Aitor/Desktop/Programas/proyecto/Juego/src/Sonidos/dispM.mp3"));

        new Thread() {
            @Override
            public void run() {
                try {
                    while (true) {
                        if (!pausa) {
                            if (!pl.play(1)) {
                                break;
                            }
                        }
                    }
                } catch (JavaLayerException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }
    
    public void sonidoRecarga() throws FileNotFoundException,
            JavaLayerException, InterruptedException {
        final Player pl = new Player(new FileInputStream(
                "C:/Users/Aitor/Desktop/Programas/proyecto/Juego/src/Sonidos/recarga.mp3"));

        new Thread() {
            @Override
            public void run() {
                try {
                    while (true) {
                        if (!pausa) {
                            if (!pl.play(1)) {
                                break;
                            }
                        }
                    }
                } catch (JavaLayerException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }
    
    public void sonidoCoin() throws FileNotFoundException,
            JavaLayerException, InterruptedException {
        final Player pl = new Player(new FileInputStream(
                "C:/Users/Aitor/Desktop/Programas/proyecto/Juego/src/Sonidos/coin.mp3"));

        new Thread() {
            @Override
            public void run() {
                try {
                    while (true) {
                        if (!pausa) {
                            if (!pl.play(1)) {
                                break;
                            }
                        }
                    }
                } catch (JavaLayerException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }
    
    public void sonidoDaño() throws FileNotFoundException,
            JavaLayerException, InterruptedException {
        final Player pl = new Player(new FileInputStream(
                "C:/Users/Aitor/Desktop/Programas/proyecto/Juego/src/Sonidos/golpe.mp3"));

        new Thread() {
            @Override
            public void run() {
                try {
                    while (true) {
                        if (!pausa) {
                            if (!pl.play(1)) {
                                break;
                            }
                        }
                    }
                } catch (JavaLayerException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }
    
    public void sonidoVacio() throws FileNotFoundException,
            JavaLayerException, InterruptedException {
        final Player pl = new Player(new FileInputStream(
                "C:/Users/Aitor/Desktop/Programas/proyecto/Juego/src/Sonidos/vacio.mp3"));

        new Thread() {
            @Override
            public void run() {
                try {
                    while (true) {
                        if (!pausa) {
                            if (!pl.play(1)) {
                                break;
                            }
                        }
                    }
                } catch (JavaLayerException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }
    public void sonidoZombie() throws FileNotFoundException,
            JavaLayerException, InterruptedException {
        final Player pl = new Player(new FileInputStream(
                "C:/Users/Aitor/Desktop/Programas/proyecto/Juego/src/Sonidos/zombie.mp3"));

        new Thread() {
            @Override
            public void run() {
                try {
                    while (true) {
                        if (!pausa) {
                            if (!pl.play(1)) {
                                break;
                            }
                        }
                    }
                } catch (JavaLayerException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }
    
    public void sonidoBoss() throws FileNotFoundException,
            JavaLayerException, InterruptedException {
        final Player pl = new Player(new FileInputStream(
                "C:/Users/Aitor/Desktop/Programas/proyecto/Juego/src/Sonidos/boss.mp3"));

        new Thread() {
            @Override
            public void run() {
                try {
                    while (true) {
                        if (!pausa) {
                            if (!pl.play(1)) {
                                break;
                            }
                        }
                    }
                } catch (JavaLayerException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }
}
