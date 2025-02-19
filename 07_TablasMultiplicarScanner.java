import java.util.Scanner;

public class TablasMultiplicarScanner {
    public static void main(String[] args) {

        int resultado = 0;

        Scanner Teclado = new Scanner (System.in);
        System.out.println("Escribe un numero para sacar su tabla de multiplicar");
        int numero = Teclado.nextInt();

        for(int i = 1; i <= 10; i++){
            resultado= numero * i;
            System.out.println(resultado);
        }
    }
}
