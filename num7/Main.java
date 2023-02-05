package num7;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(dividePorCero(20,0));
        }catch(ArithmeticException e){
            System.out.println("Esto no puede hacerse");
        }finally {
            System.out.println("Demo de código");
        }
    }
    public static int dividePorCero(int num1, int num2) throws ArithmeticException{
        int resultado = num1 / num2;
        return resultado;
    }
}
