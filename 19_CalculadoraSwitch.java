import java.util.Scanner;

public class CalculadoraSwitch {
    public static void main (String[] args) {

        int resultado = 0;
        String operacion = null;
        
        System.out.println("Ingresa el primer numero");
        Scanner num1s = new Scanner (System.in);
        int num1 = num1s.nextInt();

        System.out.println("Ingresa el segundo numero");
        Scanner num2s = new Scanner (System.in);
        int num2 = num2s.nextInt();

        System.out.println("Que tipo de operacion se va a realizar (suma/resta/multiplicacion/division)");
        Scanner ope = new Scanner (System.in);
        operacion = ope.next();

        switch (operacion) {
            case "suma":
                resultado = num1 + num2;
            break;
            case "resta":
                resultado = num1 - num2;
            break;
            case "multiplicacion":
                resultado = num1 * num2;
            break;
            case "division":
                resultado = num1 / num2;
            break;
        }

        System.out.println("El resultado de tu " + operacion + " es " + resultado);
    }    
}
