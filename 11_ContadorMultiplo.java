import java.util.Scanner;

public class ContadorMultiplo {
    public static void main(String[] args) {

        System.out.println("Introduce el numero limite para calcular");
        Scanner numlimes = new Scanner(System.in);
        int numlit = numlimes.nextInt();

        int numini = 0;
        int numcont = 3;
        int resultado = 0;

        while(numcont <= numlit){
            System.out.println(numcont);
            numcont = numcont + 3;
            resultado = (resultado + numcont) - 3;
            numini = numini + 1;
        }

        System.out.println("El resultado de la suma del multiplo de 3 es: " + resultado);
        System.out.println("La cantidad de numeros es: " + numini);
    }
}
