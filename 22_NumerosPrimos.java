import javax.swing.*;

public class NumerosPrimos {
    public static void main (String[] args) {

        int n = 0;
        int x = 2;

        String PrimoEntrada = JOptionPane.showInputDialog("Introduzca un número y se definira si es primo");
        n = Integer.valueOf(PrimoEntrada);

        if (n % x == 0) {
            System.out.println("El numero " + n + " no es primo");
        } else {
            while (n%x != 0) {
                x = x + 1;
                if (n == x) {
                    System.out.println("El numero " + n + " es primo");
                }else if (n%x == 0){
                    System.out.println("El numero " + n + " no es primo");
                }
            }
        }
    }
}
