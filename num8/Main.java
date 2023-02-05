package num8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        copiarFichero("D:/prueba.dat","D:/prueba5.dat");
    }
    public static void copiarFichero(String fileIn, String fileOut){
        try {
            InputStream in = new FileInputStream(fileIn);
            System.out.println("Copiando...");
            byte[] datos = in.readAllBytes();
            in.close();

            PrintStream out = new PrintStream(fileOut);
            out.write(datos);
            System.out.println("Copiado exitosamente");
            out.close();
        }catch (Exception e){
            e.getMessage();
        }
    }
}
