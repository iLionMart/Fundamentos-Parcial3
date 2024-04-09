import java.util.Scanner;

public class main {
    public static void main(String[] args) {

    Scanner Teclado = new Scanner (System.in);
    System.out.println("Escribe una palabra");
    String palabra = Teclado.next();

        for(int i = 1; i <= 10; i++){
            System.out.println(palabra);
        }
    }
}
