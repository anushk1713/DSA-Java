import java.util.Scanner;
public class SortingAnArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //n for array size
        int n = sc.nextInt();
        //for storing the values of same data type
        int[] arr = new int[n];
        //assuming array is sorted
        boolean isSorted = true;
        //values
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        //checking whether the array is sorted or not
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted = false;
            }
        }
        //if array is sorted print sorted else not sorted
            if(isSorted == true){
                System.out.print("Array is sorted");
            }
            else 
                System.out.print("Array is not sorted");
    }
}
