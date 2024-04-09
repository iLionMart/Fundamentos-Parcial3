import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner Teclado = new Scanner (System.in);
        System.out.println("Escribe un numero entero positivo");
        int numero = Teclado.nextInt();

        while(numero >= 0){
            System.out.print(numero + " , ");
            numero = numero - 1;
        }
    }
}
