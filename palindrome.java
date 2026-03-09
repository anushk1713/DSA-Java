//Java Program to check number is palindrome or not by reversing a number
import java.util.Scanner;
public class palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int original = n;
        int reverse = 0;
        
        //whilee loop for iteration until n == 0
        while(n!=0){
            int lastdigit = n%10;//extractes lastdigit of a number
            reverse = reverse*10+lastdigit;//reversess number
            n = n/10;//extracts remaining quotient of number
        }

        if(original == reverse)//checks original number = reversed number 
            System.out.print("Palindrom");//palindrome printing
        else
            System.out.println("not a palindrome");
    }
}

