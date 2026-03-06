import java.util.Scanner;

public class fixednumpattern{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);  
     int n = sc.nextInt();

     // it prints same number as row number if row is 1 then it prints 1111 2222 3333 4444 for others..loop continues
     for(int i=1;i<=4;i++){
        for(int j=1;j<=4;j++){
            // System.out.print(j);//if we print j o/p is 1234 4 times
            System.out.print(i);//if we print i o/p is 1111 2222 3333 4444
        }
        System.out.println();
     } 
    }
}
