import java.util.Scanner;
public class hollow{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();   

    //outer loop for rows
     for(int i=1;i<=n;i++){
         //inner loop decides what element should be there in a row
        for(int j=1;j<=n;j++){
            //condition to for hollow print
            if(i==1 || i==n || j==1 || j==n)
              System.out.print("*");
            else 
               System.out.print(" ");
        }
        System.out.println();
     }
    }
}
