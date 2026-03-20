import java.util.Scanner;
public class SortedArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //n for array size
        int n = sc.nextInt();
        //array for storing the values
        int[] arr = new int[n];
        //accepting the array values
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        //checking whether array is sorted or not if not sorting it in ascending order
        for(int i=0;i<n-1;i++){
            //assumes array is sorted
            boolean isSorted = true;
            for(int j=0;j<n-i-1;j++){
                //condtion to check the array is sorted or not
                if(arr[j]>arr[j+1]){
                    isSorted = false;
                    //if not sort the array
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                } 
            }
            
            if(isSorted){
                break;//stops if no swaps happened
            }
        }

        //prints sorted array
        for(int i=0;i<n;i++)
            System.out.print(arr[i] + " ");
    }
}
