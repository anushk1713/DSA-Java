import java.util.Scanner;
public class reverseAnarray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];
        //accepting an array values
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        //printing an array values in reverse
        for(int i=n-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }

}
