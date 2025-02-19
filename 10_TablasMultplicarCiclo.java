public class TablasMultplicarCiclo {
    public static void main(String[] args) {

        int resultado = 0;

        for(int j = 1; j <= 10; j++){
           for(int i = 1; i <= 10; i++){
              resultado= j * i;
              System.out.println(resultado);
           }
           System.out.println();
        }
    }
}
