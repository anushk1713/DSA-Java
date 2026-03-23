//In this program we simply need addition of two numbers previous and next element but it prints only the sum. but in Fibonacci numbers starts from 0 & 1
//so we will initialize the 0 & 1 and then print it first then print sum of elements.
import java.util.Scanner;


public class Fibonacci{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();//accpets n value
        long prev1 = 0;//previous
        long prev2 = 1;//previous
        System.out.print(prev1 + " " + prev2 + " ");//prints previous1 & 2
        //for loop for calculating sum
        for(int i=0;i<n-2;i++){
            //long datatype is used bcz if we want large fibonacci of large number we need lot of storage so int capacity not suitable therefore we use long
            //sum of previous and next element
            long next = prev1 + prev2;
            //print next
            System.out.print(next + " ");
            prev1 = prev2;//updates prev1 to prev2
            prev2 = next;//updates prev2 to next
        }
    }
}
