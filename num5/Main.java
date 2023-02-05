package num5;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("elemento1");
        arrayList.add("elemento2");
        arrayList.add("elemento3");
        arrayList.add("elemento4");
        LinkedList<String> linkedList = new LinkedList<>(arrayList);
        System.out.println("ArrayList: ");
        for(String valor : arrayList){
            System.out.println(valor);
        }
        System.out.println("LinkedList: ");
        for(String valor : linkedList){
            System.out.println(valor);
        }
    }
}
