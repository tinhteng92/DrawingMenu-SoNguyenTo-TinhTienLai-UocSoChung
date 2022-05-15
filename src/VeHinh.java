import java.util.Scanner;

public class VeHinh {
    public static void main(String[] args) {
        int choice = -1;
        Scanner sc = new Scanner(System.in);
        while (choice != 0){
            System.out.println("--Menu--");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    int m = 3;
                    int n = 7;
                   for (int i = 0; i < m; i++) {
                       for (int j = 0; j < n; j++) {
                           System.out.print(" * ");
                       }
                       System.out.println();
                   }
                case 2:
                    System.out.println("The corner is square at botton-left ");
                    for (int i = 1; i <= 5; i++){
                        for (int j = 1; j < i ; j++){
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    System.out.println("The corner is square at top-left ");

                    for (int i = 5; i >= 1; i--){
                        for (int j = 1; j <= i; j++){
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                case 3:

                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");

            }

        }

    }
}
