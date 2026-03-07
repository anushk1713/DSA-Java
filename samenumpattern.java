import java.util.Scanner;

public class samenumpattern{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);  
     int n = sc.nextInt();

     //outerloop for rows   
     for(int i=1;i<=4;i++){
         //innerloop for colmns & prints i --> 1 22 333 4444
         
        for(int j=1;j<=i;j++){
            System.out.print(i);
        }
        System.out.println();
     } 
    }
}
