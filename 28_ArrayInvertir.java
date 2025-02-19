public class ArrayInvertir {
    public static void main(String[] args) {

        int uni = 0;
        int dec = 0;
        int cen = 0;

        int[] num = new int[4];
        num[1] = 1;
        num[2] = 4;
        num[3] = 7;

        for (int i = 1; i < 4; i++){
            if(i==1){
                cen = num[i];
            }else if(i==2){
                dec = num[i];
            }else if(i==3){
                uni = num[i];
            }
        }

        System.out.println("El numero "  + num[1] + num[2] + num[3] + " invetido es:");
        System.out.println(uni +""+ dec+"" + cen);
    }
}
