package num4;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        // el problema al utilizar un Vector con la capacidad con defecto
        // si tuviésemos 1000 elementos añadidos al mismo

        Vector<Integer> vector = new Vector<>(); // vector con capacidad por defecto

        System.out.println("Vector capacidad inicial: " + vector.capacity());
        int capacidad = vector.capacity();
        for(int i = 0; i < 1000; i++){
            vector.add(i);
            if(vector.capacity() > capacidad){ // verificamos cada desborde
                System.out.println("capacidad: "+capacidad); // por cada desborde se duplica su capacidad
                capacidad = vector.capacity();
            }
        }
        System.out.println("Vector capacidad final: " + vector.capacity());
        // Finalmente como podemos ver, la capacidad del vector se duplicó tras cada
        // desborde, lo que significaría que se estaría usando demasiada memoria innecesariamente
    }
}
