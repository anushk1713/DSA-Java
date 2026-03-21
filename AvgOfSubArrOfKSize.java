import java.util.Scanner;
public class AvgOfSubArrOfKSize{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //n for array size
        System.out.println("Enter n ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        //accepting the array values
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        //accepting the k element size
        System.out.println("Enter k");
        int k = sc.nextInt();
        //sum of k elements
        int sum_of_k = 0;
        //calculating sum of k elements
        for(int i=0;i<k;i++){
            sum_of_k = sum_of_k + arr[i];
        }
        //calculating avg of 1st sub array
        double avg = (double)sum_of_k/k;
        System.out.println(avg);

        //removing and adding the element to achieve alide window
        for(int i=k;i<n;i++){
            sum_of_k = sum_of_k - arr[i-k] + arr[i];
            //avg of other sub array
            avg = (double)(sum_of_k/k);
        System.out.println("Avg of sub array of size k is:" + avg);
        }
    }
}
