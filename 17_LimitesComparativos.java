import java.util.Scanner;

public class LimitesComparativos {
    public static void main(String[] args) {

        int limenor = 0, limayor = 0, numero = 0, suma = 0, verificador = 0;

        System.out.println("Escribe el limite menor");
        Scanner limitemenor = new Scanner(System.in);
        limenor = limitemenor.nextInt();

        while (verificador == 0) {
            System.out.println("Escribe el limite mayor");
            Scanner limitemayor = new Scanner(System.in);
            limayor = limitemayor.nextInt();

            if(limayor > limenor){
                verificador = 1;
            }else{
                System.out.println("No seas buey el limite mayor obviamente debe ser mayor >:(");
            }
        }

        verificador = verificador = 0;

        while (verificador == 0){
            System.out.println("Escribe un numero dentro de los limites");
            Scanner numlit = new Scanner(System.in);
            numero = numlit.nextInt();

            if (numero < limenor || numero > limayor){
                verificador = 1;
            }else{
                suma = suma + 1;
            }
        }

        System.out.println("La cantidad de numeros dentro del limite de " + limenor + " y " + limayor + " es: " + suma);
    }
}
