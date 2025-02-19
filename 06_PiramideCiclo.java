import java.util.Scanner;

public class PiramideCiclo {
    public static void main(String[] args) {

        int contador = 1;
        int contadorinicial = 1;
        int contadorfinal = 2;

        Scanner Teclado = new Scanner (System.in);
        System.out.println("Escribe un numero entero positivo");
        int numero = Teclado.nextInt();

        while(contador <= numero){
            while(contadorinicial < contadorfinal){
                System.out.print("*");
                contadorinicial = contadorinicial + 1;
            }
            contadorinicial = 1;
            contadorfinal = contadorfinal + 1;
            System.out.println();
            contador = contador + 1;
        }
    }
}
