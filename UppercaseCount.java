import java.util.Scanner;
public class UppercaseCount{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //accept string as input
        String str = sc.next();
        //extarct str length
        int n = str.length();
        //initialize count = 0
        int count = 0;
        //for loop to extract the each character from string
        for(int i=0;i<n;i++){
            char ch = str.charAt(i);//character extraction
            //checks for UpperCase
            if(Character.isUpperCase(ch)){
                //count++
                count++;
            }
        }
        //print count
        System.out.print(count);

    }
}
