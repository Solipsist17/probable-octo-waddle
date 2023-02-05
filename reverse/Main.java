package reverse;

public class Main {
    public static void main(String[] args) {
        System.out.println(reverse("Este es un mensaje en reversa"));
    }
    public static String reverse(String texto){
        String cadena = texto;
        char[] arr = new char[cadena.length()];
        for(int i=0;i<cadena.length();i++){ // Agregamos los caracteres de la cadena a un array
            arr[i] = cadena.charAt(i);
        }

        String concatenar = "";
        for(int i=cadena.length()-1;i>=0;i--){ // Agregamos los caracteres de forma decreciente
            //arr[i] = cadena.charAt(i);
            concatenar = concatenar + cadena.charAt(i);
        }
        return concatenar;
    }
}
