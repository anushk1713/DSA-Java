//Java Program to reverse an number
import java.util.Scanner;

public class reverse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int original = n;
        int reverse = 0;
        //while loop for iteration until n becomes zero
        while(n != 0){
            int lastdigit = n%10;//extracts lastdigit
            reverse = reverse*10+lastdigit;//reverses a number 
            n = n/10; //remaining quotient is used for next iteration
        }
        System.out.print(reverse);//printing reverse
        
    }

}
