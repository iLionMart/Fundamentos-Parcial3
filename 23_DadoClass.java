public class main {
    public static void main(String[] args) {

        int Dado = 0;
        int promedio = 0;
        int total = 0;
        int min = 0;
        int max = 0;

        for(int i = 1; i <= 50; i++){
            Dado = (int) (Math.floor(Math.random() * (199 - 100)) + 100);
            System.out.print(Dado + " ");
            total += Dado;
            if (min == 0){
                min = Dado;
            }
            if (Dado < min){
                min = Dado;
            }

            if (Dado > max){
                max = Dado;
            }
        }

        promedio = total/50;

        System.out.println();
        System.out.println("El promedio de la tirada de dados es: " + promedio);
        System.out.println("La cantidad minima de la tirada es: " + min);
        System.out.println("La cantidad maxima de la tirada es: " + max);
    }
}
