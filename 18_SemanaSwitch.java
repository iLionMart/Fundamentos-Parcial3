import java.util.Scanner;

public class SemanaSwitch {
    public static void main (String[] args) {

        String nomdia = null;
        int dia = 0;

        System.out.println("Introduce un numero para determinar el dia");
        Scanner dian = new Scanner (System.in);
        dia = dian.nextInt();
        
        switch (dia) {
            case 1:
                nomdia = "Lunes";
            break;
            case 2:
                nomdia = "Martes";
            break;
            case 3:
                nomdia = "Miercoles";
            break;
            case 4:
                nomdia = "Jueves";
            break;
            case 5:
                nomdia = "Viernes";
            break;
            case 6:
                nomdia = "Sabado";
            break;
            case 7:
                nomdia = "Domingo";
            break;
        }

        System.out.println("El dia es: " + nomdia );
    }
}
