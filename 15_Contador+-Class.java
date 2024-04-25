import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int cantidadnum = 0, contadorcant = 0, numero = 0, contadornum = 0, contadornumnega = 0;

        System.out.println("Escribe la cantidad de numeros a ingresar");
        Scanner cantnum = new Scanner(System.in);
        cantidadnum = cantnum.nextInt();

        System.out.println("Escribe un numero positivo");
        Scanner numeros = new Scanner(System.in);
        numero = numeros.nextInt();

        if (numero <= 0) {
            contadornumnega = contadornumnega + 1;
        } else {
            contadornum = contadornum + 1;
            contadorcant = contadorcant + 1;
            while (contadorcant < cantidadnum) {
                System.out.println("Escribe otro numero positivo");
                Scanner numeros2 = new Scanner(System.in);
                numero = numeros2.nextInt();
                if (numero <= 0) {
                    contadornumnega = contadornumnega + 1;
                    contadorcant = contadorcant + 1;
                } else {
                    contadornum = contadornum + 1;
                    contadorcant = contadorcant + 1;
                }
            }

            System.out.println("De los " + cantidadnum + " numeros");
            System.out.println(contadornum + " fueron positivos");
            System.out.println(contadornumnega + " fueron negativos");
        }
    }
}
