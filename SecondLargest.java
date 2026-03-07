import java.util.Scanner;
public class SecondLargest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        //loop to accept the values
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        //Integer.MIN_VALUE: automatically sets to min value
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        //finds largest element
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                secondlargest = largest;
                largest = arr[i];
            }
        }

        //finds secnd largest element
        for(int i=0;i<n-1;i++){
            if(arr[i]>secondlargest && secondlargest != largest){
                secondlargest = arr[i];
            }
        }
        System.out.println(secondlargest);

    }
}
