import java.util.Scanner;

public class PiramideCiclo3 {
    public static void main(String[] args) {

        System.out.print("Introduzca un caracter: ");
        Scanner caracterwa = new Scanner(System.in);
        String caracter = caracterwa.next();

        System.out.println();

        System.out.print("Introduzca una altura: ");
        Scanner alturawa = new Scanner(System.in);
        int altura = alturawa.nextInt();

        int cantidad = 1;
        int espacios = 0;

        for (int i = 1; i <= altura; i++){
            if (i != altura){
                for (int n = 0; n < espacios; n++){
                    System.out.print(" ");
                }
                espacios --;
                for (int n = 1; n <= cantidad; n++){
                    if ((n == 1) || (n == cantidad)){
                        System.out.print(caracter);
                    }else{
                        System.out.print(" ");
                    }
                }
                cantidad += 2;
                System.out.println();
            }else{
                for (int n = 0; n < espacios; n++){
                    System.out.print(" ");
                }
                espacios --;
                for (int n = 1; n <= cantidad; n++){
                    System.out.print(caracter);
                }
            }
        }
    }
}
