import java.util.Scanner;

public class PiramideCiclo2 {
    public static void main(String[] args) {

        int contador = 1;
        int contadorinicial = 1;
        int contadorfinal = 2;
        int numero2 = 1;
        int aumentador = 1;

        Scanner Teclado = new Scanner (System.in);
        System.out.println("Escribe un numero entero positivo");
        int numero = Teclado.nextInt();

        while(contador <= numero){
            while(contadorinicial < contadorfinal){
                System.out.print(numero2 + " , ");
                contadorinicial = contadorinicial + 1;
                numero2 = numero2 - 2;
            }
            numero2 = 1;
            aumentador = aumentador + 2;
            numero2 = numero2 * aumentador;
            contadorinicial = 1;
            contadorfinal = contadorfinal + 1;

            System.out.println();
            contador = contador + 1;
        }
    }
}
