public class ArraySuma {
    public static void main(String[] args) {

        int resultado = 0;
        int[] num = new int[6];
        num[1] = 3;
        num[2] = 5;
        num[3] = 2;
        num[4] = 8;
        num[5] = 6;

        for (int i=1; i < 6; i++){
            resultado += num[i];
        }

        System.out.println("La suma de los elementos es: " + resultado);
    }
}
