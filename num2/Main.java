package num2;

public class Main {
    public static void main(String[] args) {
        int enteros[][] = {{1,2,3},{10,20,30},{100,200,300}};
        for(int i = 0; i < enteros.length; i++){
            for(int j = 0; j < enteros[0].length; j++){
                System.out.println("Posición: "+ i + ", "+ j + "\t Valor:"+  enteros[i][j]);
            }
        }
    }
}
