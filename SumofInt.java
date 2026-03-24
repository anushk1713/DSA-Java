
import java.util.Scanner;

public class SumofInt{
    public static void main(String[] args){
       
        Scanner sc = new Scanner(System.in);
        //accept the string
        String str = sc.nextLine();
        //split the string to get string as array
        String[] arr = str.split(" ");
        //sum = 0
        int sum = 0;
        //loop for converting array to int
        for(int i=0;i<arr.length;i++){
            int num = Integer.parseInt(arr[i]);//converts array to int
            sum = sum+num;//sum ups the values

        }
        //prints sum
        System.out.print(sum);
        
    }
}
