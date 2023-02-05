package num9;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<Integer,String> mapa = new HashMap<>();

        System.out.println("¿Cuántos ficheros desea guardar?");
        int num = scan.nextInt();
        for(int i = 0; i < num; i++){  // guardamos los ficheros
            System.out.println("Ingrese el fichero "+(i+1)+":");
            String file = scan.next();
            try {
                InputStream in = new FileInputStream(file);
                mapa.put((i+1), file);
                in.close();
                System.out.println("fichero "+(i+1)+" guardado");
            } catch(FileNotFoundException e){
                System.out.println("No se pudo encontrar el fichero");
                i--;
            } catch(IOException e){
                System.out.println("Ha ocurrido un error");
                i--;
            }
        }

        boolean bd = true; // bandera de validación

        if(num < 1){
            bd = false;
        }

        while(bd == true) {
            mostrarFicheros(mapa);
            System.out.println("Elija la clave de un fichero:");
            int claveFile = scan.nextInt();
            if(claveFile > mapa.size() || claveFile < 1){ // validamos que exista esa clave
                System.out.println("Instrucción inválida");
            }else {
                System.out.println("¿Qué desea hacer?");
                System.out.println("leer(1) copiar(2) escribir(3) salir(4)");
                int eleccion = scan.nextInt();
                try {
                    InputStream in = new FileInputStream(mapa.get(claveFile));
                    byte[] datos = in.readAllBytes();
                    in.close();
                    if (eleccion == 1) {
                        System.out.println("-----------------------");
                        for (byte dato : datos) {
                            System.out.print((char) dato);
                        }
                        System.out.println("\n-----------------------");
                    } else if (eleccion == 2) {
                        System.out.println("Indica el nombre y la ruta de la copia: ");
                        String copia = scan.next();
                        PrintStream out = new PrintStream(copia);
                        out.write(datos);
                        out.close();
                        System.out.println("fichero copiado exitosamente!");
                    } else if (eleccion == 3) {
                        PrintStream out = new PrintStream(mapa.get(claveFile));
                        System.out.println("Indica el texto a escribir: ");
                        String texto = scan.next();
                        out.print(texto);
                        out.close();
                        System.out.println("texto escrito exitosamente!");
                    } else if (eleccion == 4) {
                        bd = false;
                    } else System.out.println("Instrucción inválida");
                } catch (FileNotFoundException e) {
                    System.out.println("No se pudo encontrar el fichero");
                } catch (IOException e) {
                    System.out.println("Ha ocurrido un error");
                }
            }
        }

    }
    public static void mostrarFicheros(HashMap<Integer,String> mapa){
        System.out.println("-----------FICHEROS----------");
        for(Map.Entry<Integer,String> elemento : mapa.entrySet()){
            System.out.println("Clave: "+elemento.getKey()+"\tValor: "+elemento.getValue());
        }
        System.out.println("------------------------------");
    }

}
