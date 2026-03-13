import  java.util.Scanner;
public class reverseString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //accept the string
        String str = sc.next();
        int n = str.length();
        //accept the array
        char[] arr = new char[n];
        //for loop to convert string to array
        for(int i=0;i<n;i++){
            arr[i] = str.charAt(i);
        }

        int j = 0;
        //reverse array to store the reverse array
        char[] reverse = new char[n];
        //reverse array storing
        for(int i=n-1;i>=0;i--){
            reverse[j] = arr[i];
            j++;
        }
        //printing reverse string
        for(j=0;j<=n-1;j++)
         System.out.print(reverse[j]);

    }
}
