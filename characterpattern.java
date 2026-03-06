import java.util.Scanner;
public class characterpattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char c = 'A';

        //charcter pattern printing ex: A = 65 after c++ it will 66=B..loop continues
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(c);
                c++;
            }
            System.out.println();
        }

    }
}
