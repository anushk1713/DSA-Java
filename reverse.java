import java.util.Scanner;
public class reverse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //outerloop for rows
        for(int i=1;i<=4;i++){
            //innerloop for columns & prints pattern in reverse order like 1 21 321 4321
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
