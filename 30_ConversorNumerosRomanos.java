import javax.swing.*;

public class ConversorNumerosRomanos {
    public static void main(String[] args) {

        String numeroromano = JOptionPane.showInputDialog("Introduzca un número menor a 10000 y se convertira a romano");
        int numrom = Integer.valueOf(numeroromano);

        int milar = 0;
        int centena = 0;
        int decena = 0;
        int unidad = 0;

        if (numrom > 10000) {
            System.out.println("Te dije que menor >:(");
        } else {
            milar = numrom / 1000;
            centena = (numrom / 100) - (milar * 10);
            decena = (numrom / 10) - (centena * 10) - (milar * 100);
            unidad = numrom % 10;
        }

        while (milar > 0) {
            System.out.print("M");
            milar -= 1;
        }

        while(centena > 0){
            if (centena < 4){
                System.out.print("C");
                centena -= 1;
            } else if (centena == 4) {
                System.out.print("CD");
                centena = 0;
            } else if (centena >= 5 && centena <= 8) {
                System.out.print("D");
                centena -= 5;
                while (centena > 0){
                    System.out.print("C");
                    centena -= 1;
                }
            } else if (centena == 9) {
                System.out.print("CM");
                centena = 0;
            }
        }

        while(decena > 0){
            if (decena < 4){
                System.out.print("X");
                decena -= 1;
            } else if (decena == 4) {
                System.out.print("XL");
                decena = 0;
            } else if (decena >= 5 && decena <= 8) {
                System.out.print("L");
                decena -= 5;
                while (decena > 0){
                    System.out.print("X");
                    decena -= 1;
                }
            } else if (decena == 9) {
                System.out.print("XC");
                decena = 0;
            }
        }

        while(unidad > 0){
            if (unidad < 4){
                System.out.print("I");
                unidad -= 1;
            } else if (unidad == 4) {
                System.out.print("IV");
                unidad = 0;
            } else if (unidad >= 5 && unidad <= 8) {
                System.out.print("V");
                unidad -= 5;
                while (unidad > 0){
                    System.out.print("I");
                    unidad -= 1;
                }
            } else if (unidad == 9) {
                System.out.print("IX");
                unidad = 0;
            }
        }
    }
}
