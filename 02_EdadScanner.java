import java.util.Scanner;

public class EdadScanner {
    public static void main(String[] args) {

        int numero = 1;

        Scanner Teclado = new Scanner (System.in);
        System.out.println("Escribe tu Edad");
        int Edad = Teclado.nextInt();

        while(numero <= Edad){
            System.out.println(numero);
            numero = numero + 1;
        }
    }
}
