import java.util.Scanner;
public class continuousnumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = 1;
        int n = sc.nextInt();

        //continuous number pattern printing ex: num =1 after increment it will be 234567...loop continues
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
}
