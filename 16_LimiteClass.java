import java.util.Scanner;

public class main {
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
            System.out.println("Escribe un numero que este dentro del limite");
            Scanner numing = new Scanner(System.in);
            numero = numing.nextInt();

            if(numero < limenor || numero > limayor){
                verificador = 1;
            }
            suma = suma + numero;
        }

        System.out.println("Te pasaste del limite");
        System.out.println("La suma de los numeros es " + suma);
    }
}
