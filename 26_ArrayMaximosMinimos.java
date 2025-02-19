public class ArrayMaximosMinimos {
    public static void main(String[] args) {

        int min = 0;
        int max = 0;

        int[] num = new int[5];
        num[1] = 2;
        num[2] = 6;
        num[3] = 8;
        num[4] = 12;

        for (int i=1; i < 5; i++){
            if (min == 0){
                min = num[i];
            }
            if (num[i] < min){
                min = num[i];
            }
            if (num[i] > max){
                max = num[i];
            }
        }

        System.out.println("El numero mas bajo fue: " + min);
        System.out.println("El numero mas alto fue: " + max);
    }
}
