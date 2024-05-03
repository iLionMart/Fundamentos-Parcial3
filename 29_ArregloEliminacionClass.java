public class main {
    public static void main(String[] args) {

        int aprobado = 0;

        int[] num = new int[9];
        num[1] = 2;
        num[2] = 4;
        num[3] = 6;
        num[4] = 6;
        num[5] = 8;
        num[6] = 10;
        num[7] = 10;
        num[8] = 12;

        for (int i=1; i < 9; i++){
            if(aprobado == num[i]){

            }else{
                System.out.println(num[i]);
            }
            aprobado = num[i];
        }
    }
}
