import javax.swing.*;

public class main {
    public static void main(String[] args) {

        String busqueda = JOptionPane.showInputDialog("Introduzca un número y se buscara");
        int busquedanum = Integer.valueOf(busqueda);

        int[] num = new int[6];
        num[1] = 15;
        num[2] = 24;
        num[3] = 67;
        num[4] = 42;
        num[5] = 32;

        for (int i=1; i < 6; i++){
            if(num[i] == busquedanum){
                System.out.println("El numero " + busquedanum + " fue encontrado");
                i = 100000;
            }else if (i==5){
                System.out.println("El numero " + busquedanum + " no fue encontrado " + "-1");
            }
        }
    }
}
