import java.util.Scanner;
public class space{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);   
     int n = sc.nextInt();

        //outer loop for rows for upper part
     for(int i=1;i<=n;i++){
         //inner loop for space
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
         //2nd inner loop for pattern
        for(int k=1;k<=i;k++){
            System.out.print(k);
        }
         //nextline
        System.out.println();
     }

        //2nd loop for lower part
      for(int i=n-1;i>=1;i--){
          //inner loop for space
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
          //2nd inner loop for pattern
        for(int k=1;k<=i;k++){
            System.out.print(k);
        }
           //nextline
        System.out.println();
     }
    }
}
