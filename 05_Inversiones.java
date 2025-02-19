import java.util.Scanner;

public class Inversiones {
    public static void main(String[] args) {

        int contador = 1;
        double resultado = 0;

        Scanner Teclado = new Scanner (System.in);
        System.out.println("Escribe tu inversion a realizar");
        double inversion = Teclado.nextDouble();

        Scanner Teclado2 = new Scanner (System.in);
        System.out.println("Escribe la duracion de tu inversion a realizar");
        int duracion = Teclado2.nextInt();

        while(contador <= duracion){
            resultado = resultado + inversion + (inversion * 0.11);
            System.out.println("El " + contador + " año tu inversion es de " + resultado);
            contador = contador + 1;
        }
    }
}
