import java.util.Scanner;

public class main {
    public static void main (String[] args) {

        double resultado = 0;

        System.out.println("Ingresa una longitud en metros");
        Scanner logs = new Scanner (System.in);
        double longitud = logs.nextDouble();

        System.out.println("Ingresa la longitud a la que convertir (pies/pulgadas/yardas)");
        Scanner conv = new Scanner (System.in);
        String conver = conv.next();

        switch (conver) {
            case "pies":
                resultado = longitud * 3.28084;
            break;
            case "pulgadas":
                resultado = longitud * 39.3701;
            break;
            case "yardas":
                resultado = longitud * 1.09361;
            break;
        }

        System.out.println("Tu longitud convertida de metros a " + conver + " es " + resultado + conver);
    }
}
