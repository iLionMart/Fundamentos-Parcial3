import java.util.Scanner;

public class Password {
    public static void main(String[] args) {

        Scanner Teclado = new Scanner (System.in);
        System.out.println("Escribe una contraseña");
        String pass1 = Teclado.next();

        Scanner Teclado2 = new Scanner (System.in);
        System.out.println("Escribe nuevamente la contraseña");
        String pass2 = Teclado2.next();

        if(pass1.equals(pass2)){
            System.out.println("La contraseña es correcta");
        }else{
            System.out.println("La contraseña no es correcta");
        }
    }
}
