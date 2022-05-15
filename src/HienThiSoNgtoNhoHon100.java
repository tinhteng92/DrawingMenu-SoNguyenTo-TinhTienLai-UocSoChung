import java.util.Scanner;

public class HienThiSoNgtoNhoHon100 {
    public static void main(String[] args) {
        int N = 2;
        System.out.println("Danh sách các số nguyên tố nhỏ hơn 100: ");
        while (N < 100){
           if(isNguyenTo(N)){
               System.out.println(N + " ");
           }
           N++;
        }
    }
    public static boolean isNguyenTo(int n){
        for (int i = 2; i < Math.sqrt(n); i++) {
            if(n % 2 == 0)
                return false;
        }
        return true;
    }
}
