import java.util.Scanner;

public class ContadorImpares {
    public static void main(String[] args) {

        int contador = 1;

        Scanner Teclado = new Scanner (System.in);
        System.out.println("Escribe un numero entero positivo");
        int numero = Teclado.nextInt();

        while(contador <= numero){
            if (contador % 2 == 0){
                contador = contador + 1;
            }else{
                System.out.print(contador + " , ");
                contador = contador + 1;
            }
        }
    }
}
