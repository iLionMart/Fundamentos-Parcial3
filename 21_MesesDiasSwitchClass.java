import java.util.Scanner;

public class main {
    public static void main (String[] args) {

        String nomes = null;
        int cantidadias = 0;
        
        System.out.println("Introduce un mes del 1 al 12");
        Scanner mescan = new Scanner (System.in);
        int mes = mescan.nextInt();

        switch (mes) {
            case 1:
                cantidadias = 31;
                nomes = "Enero";
            break;
            case 2:
                cantidadias = 28;
                nomes = "Febrero";
            break;
            case 3:
                cantidadias = 31;
                nomes = "Marzo";
            break;
            case 4:
                cantidadias = 30;
                nomes = "Abril";
            break;
            case 5:
                cantidadias = 31;
                nomes = "Mayo";
            break;
            case 6:
                cantidadias = 30;
                nomes = "Junio";
            break;
            case 7:
                cantidadias = 31;
                nomes = "Julio";
            break;
            case 8:
                cantidadias = 31;
                nomes = "Agosto";
            break;
            case 9:
                cantidadias = 30;
                nomes = "Septiembre";
            break;
            case 10:
                cantidadias = 31;
                nomes = "Octubre";
            break;
            case 11:
                cantidadias = 30;
                nomes = "Noviembre";
            break;
            case 12:
                cantidadias = 31;
                nomes = "Diciembre";
            break;
        }

        System.out.println("El mes " + nomes + " cuenta con " + cantidadias);
    }
}
