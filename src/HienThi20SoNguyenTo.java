import java.util.Scanner;

public class HienThi20SoNguyenTo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        int N = 2;
        System.out.println("Nhập số lượng số nguyên tố mà bạn muốn in ra: ");
        int number = input.nextInt();
        while (count < number){
            if (isNguyenTo(N)){
                System.out.println(N + " ");
                count++;
            }
            N++;
        }
    }
    public static boolean isNguyenTo(int n){
       boolean check = true;
       if(n < 2 ){
           check = false;
       }else {
           for (int i = 2; i < Math.sqrt(n); i++) {
               if(n % i == 0){
                   check = false;
                   break;
               }
           }
       }
        return check;
    }

}
