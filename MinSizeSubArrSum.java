
import java.util.Scanner;

public class MinSizeSubArrSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();//accepts n
        int[] arr = new int[n];//arr for storing values

        for (int end = 0; end < n; end++) {
            arr[end] = sc.nextInt();//array value acceptance
        }

        int start = 0;//start = 0
        int sum = 0;//sum = 0
        int end = 0;//end = 0
        int window_length;//window_length
        System.out.println("Enter Targate");//targate value
        int target = sc.nextInt();//targate value acceptance
        int min_length = Integer.MAX_VALUE;//min value
        
        //adds each elements to sum
        for (end = 0; end < n; end++) {
            sum = sum + arr[end];
            //loop runs until sum>=targate
            while (sum >= target) {
                window_length = end - start + 1;//expanfing the subarray

                //checks condition window_length < min_length
                if (window_length < min_length) {
                    //update the  window_length
                    min_length = window_length;
                }
                //used to print subarray which has min length
                 for (int i = start; i <= end; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println(" ");
                    //shrinks subarray
                    sum = sum - arr[start];
                    //increase start
                    start++;

            }
        }
        //min_length prints
        System.out.println(min_length);

    }
}
