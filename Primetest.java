import java.util.Scanner;

public class Primetest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isprime = true;
        //condition to check the number is prime or not
        if(n<=1){
            isprime = false;
        }else{
            //loop for checking the prime
            for(int i=2;i<=n/2;i++){
                if(n%2==0){
                    isprime = false;
                    break;
                }
            }
            //if prime print prime else not prime
            if(isprime){
                System.out.print("Prime");
            }
            else{
                System.out.print("Not Prime");
            }
        }
    }
}
