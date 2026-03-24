//for Fibonacci we need two variables one is previous1 and previous2 bcz it start from 0,1. and we use long datatypw for it
import java.util.Scanner;
public class Fibonacci{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        //accept the n value
        int n = sc.nextInt();
        //initialize prev1 & prev2
        long prev1 = 0;
        long prev2 = 1;
        //print it
        System.out.print(prev1 + " " + prev2 + " ");
        //loop to achieve the Fibonacci
        for(int i=0;i<n-2;i++){
            long next = prev1 + prev2;
            System.out.print(next + " ");
            prev1 = prev2;
            prev2 = next;
        }
    }
}
