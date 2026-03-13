import java.util.Scanner;
public class tengthunitsum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //accept the n
        int n = sc.nextInt();
        int sum = 0; // initialize the sum = 0
        //math logic to print the tength ad unit digit sum
        sum = n%10+(n/10)%10;
        System.out.print(sum);
    }
}
