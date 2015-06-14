package juego;

import java.io.FileNotFoundException;
import javazoom.jl.decoder.JavaLayerException;

public class Juego {

    public static int opc;

    public static void main(String[] args) throws FileNotFoundException, JavaLayerException, InterruptedException {
        
        Menu menu = new Menu(opc);
        
        
    }

    public void ejecutar(int opc) throws JavaLayerException, FileNotFoundException, InterruptedException {
        
        Escenario esc = new Escenario(opc);

    }

}
