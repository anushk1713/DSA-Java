
import java.util.Scanner;

public class fulldiamond {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //outer loop for row 1st loop
        for (int i = 1; i <= n; i++) {
            
            //1st inner loop for space printing
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            //2nd inner loop for pattern *
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(j);//print("*")
            }
            System.out.println();
        }

        //2nd loop
        for (int i = n - 1; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(j);//print("*")
            }
            System.out.println();
        }
    }
}
