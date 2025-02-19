public class ArregloPromedio {
    public static void main(String[] args) {
            int resultado = 0;
            int[] cal = new int[5];
            cal[1] = 8;
            cal[2] = 6;
            cal[3] = 5;
            cal[4] = 9;

            for (int i=1; i < 5; i++) {
                resultado += cal[i];
            }
            resultado = resultado/4;

            System.out.println("El promedio del alumno es: " + resultado);
    }
}
