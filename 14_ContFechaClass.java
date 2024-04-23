import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        String dianom = null;
        String dianom2 = null;
        int resultadoresdia = 0;
        int resultadoreshor = 0;
        int reshor = 0;
        int resultado = 0;

        System.out.println("Introduce el dia inicial");
        Scanner scandia1 = new Scanner(System.in);
        int dia1 = scandia1.nextInt();

        System.out.println("Introduce la hora inicial");
        Scanner scanhora1 = new Scanner(System.in);
        int hora1 = scanhora1.nextInt();

        System.out.println("Introduce el dia final");
        Scanner scandia2 = new Scanner(System.in);
        int dia2 = scandia2.nextInt();

        System.out.println("Introduce la hora final");
        Scanner scanhora2 = new Scanner(System.in);
        int hora2 = scanhora2.nextInt();

        if (dia1 == 1) {
            dianom = "Lunes";
        } else if (dia1 == 2) {
            dianom = "Martes";
        } else if (dia1 == 3) {
            dianom = "Miercoles";
        } else if (dia1 == 4) {
            dianom = "Jueves";
        } else if (dia1 == 5) {
            dianom = "Viernes";
        } else if (dia1 == 6) {
            dianom = "Sabado";
        } else if (dia1 == 7) {
            dianom = "Domingo";
        } else if (dia1 > 7) {
            while (dia1 > 7){
                dia1 = dia1 - 7;
            }
        }
        if (dia1 == dia2) {
            dianom = dianom2;
        } else if (dia2 == 1) {
            dianom2 = "Lunes";
        } else if (dia2 == 2) {
            dianom2 = "Martes";
        } else if (dia2 == 3) {
            dianom2 = "Miercoles";
        } else if (dia2 == 4) {
            dianom2 = "Jueves";
        } else if (dia2 == 5) {
            dianom2 = "Viernes";
        } else if (dia2 == 6) {
            dianom2 = "Sabado";
        } else if (dia2 == 7) {
            dianom2 = "Domingo";
        } else if (dia2 > 7) {
            while (dia2 > 7){
                dia2 = dia2 - 7;
            }
        }

        resultadoresdia = dia2 - dia1;
        reshor = resultadoresdia * 24;

        resultadoreshor = hora2 - hora1;
        resultado = resultadoreshor + reshor;

        System.out.println("Entre las " + hora1 + ":00 del dia " + dia1 +" "+ dianom + " y las " + hora2 + ":00 del dia " + dia2 +" "+ dianom2);
        System.out.println("Hay " + resultado + " horas");

        }
    }
