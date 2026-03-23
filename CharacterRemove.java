import java.util.Scanner;
public class CharacterRemove{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //accepts String input
        String str = sc.next();
        //calulates string length
        int n = str.length();
        //to store the string as array
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            //string to char
            arr[i] = str.charAt(i);
        }
        //loop to remove characters first and last of string
        for(int i=1;i<n-1;i++){
            if(i==0 && i == n-1){
                continue;
            }

        }
        //print string
        System.out.print(str);

    }
}
