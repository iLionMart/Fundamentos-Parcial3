import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        System.out.println("Este programa pintará una pirámide");

        System.out.print("Introduzca el carácter: ");

        Scanner caracterwa = new Scanner (System.in);
        String caracter = caracterwa.next();

        System.out.print("Introduzca la altura: ");
        Scanner alturawa = new Scanner (System.in);
        int altura = alturawa.nextInt();
        int cantidad = 1;
        int espacios = 0;

        for (int i = 0; i < altura; i++) {
            espacios++;
        }

        System.out.println();

        for (int i = 0; i < altura; i++) {

            for (int n = 0; n < espacios; n++) {
                    System.out.print(" ");
            }
            espacios--;

            for (int n = 1; n <= cantidad; n++) {
                    System.out.print(caracter);
            }

            cantidad += 2;
            System.out.println();
        }
    }
}
