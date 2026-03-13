import java.util.Scanner;

public class Prime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //checking whether the n is prime or not
        if(n<=1){
            System.out.print("Not Prime");
        }
        boolean isprime = true;
        //loop to check the number is prime or not
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i == 0){
                System.out.print("not prime");
            }
        }
        //if it is prime printing prime else not prime
        if(isprime == true){
            System.out.print("Prime");
        }
        else
        System.out.print("Not prime");
    }
}
