import java.util.Scanner;
public class tengthunitsum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        sum = n%10+(n/10)%10;
        System.out.print(sum);
    }
}