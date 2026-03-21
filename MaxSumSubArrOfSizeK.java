import java.util.Scanner;

public class MaxSumSubArrOfSizeK{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //accepting the size of array n
        System.out.println("Enter n");
        int n = sc.nextInt();
        //array for storing the values
        int[] arr = new int[n];

        //accepting the values
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        //size of subarray
        System.out.println("Enter k");
        int k =sc.nextInt();

        //sum of k elements initialized to 0
        int Sum_of_k = 0;

        //calculating sum of sub array
        for(int i=0;i<k;i++){
            Sum_of_k = Sum_of_k + arr[i];
        }

        //assigning max_sum = sum of k elements
        int max_sum = Sum_of_k;

        //removing the elements and adding elemetns for sliding window
        for(int i=k;i<n;i++){
            Sum_of_k = Sum_of_k - arr[i-k]+arr[i];//sliding window
            //condition checking  whether Sum_of_k > max_sum
            if(Sum_of_k > max_sum){
                //if it is assign it to max_sum
                max_sum = Sum_of_k;
            }
        }
        //print it
        System.out.println(max_sum);
    }
}
