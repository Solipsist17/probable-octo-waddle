package num3;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(0);
        vector.add(1121);
        vector.add(-100);
        vector.add(-500);
        vector.add(1);

        vector.remove(1);
        vector.remove(1);

        System.out.println(vector);
    }
}
