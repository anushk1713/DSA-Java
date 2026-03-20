import java.util.Scanner;
public class ReversingInsideSameArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //n for the size of an array
        int n = sc.nextInt();
        //array for the storing the values of same type
        int[] arr = new int[n];
        //loop for accepting the array values
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        //two pointers to reversing inside same array using temp
        int start = 0;
        int end = arr.length - 1;
        //storing reverse array in array
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        //printing the reversed array
        for(int num = 0; num<arr.length; num++){
            System.out.print(arr[num] + " ");
        }
    }
}
