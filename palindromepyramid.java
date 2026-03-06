
import java.util.Scanner;

public class palindromepyramid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;

        //outer loop for rows
        for (int i = 1; i <= n; i++) {
            //inner loop for space
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            //2nd inner loop for incresing the number
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            //3rd inner loop for decreasing the number
            for(int j=i-1;j>=1;j--)
               System.out.print(j);
                // num++;
            System.out.println();
        }

        

    }
}
