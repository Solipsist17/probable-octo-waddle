package num6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Primer ArrayList: ");
        for(int i = 1; i <= 10; i++){
            arr.add(i);
            System.out.print(arr.get(i-1)+"\t");
        }
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) % 2 == 0){
                arr.remove(i);
            }
        }
        System.out.println("\nArrayList final:");
        for(int i = 0; i < arr.size(); i++){
            System.out.print(arr.get(i)+"\t");
        }
    }
}
