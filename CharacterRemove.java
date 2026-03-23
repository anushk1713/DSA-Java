import java.util.Scanner;
public class CharacterRemove{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = str.charAt(i);
        }

        for(int i=1;i<n-1;i++){
            if(i==0 && i == n-1){
                continue;
            }

        }
        System.out.print(str);

    }
}