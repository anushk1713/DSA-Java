
import java.util.Scanner;
public class CheckingPalindromeFarming{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //string acceptance
        String str = sc.nextLine();
        // frequency array
        int[] freq = new int[256];
        //loop to counts the no of each characters
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)]++;
        }

       
        int oddcount = 0;//counts oddone
        //coutns odd frequency characters
        for(int i=0;i<str.length();i++){
            //condition to check odd frequn=ency characters
            if(freq[str.charAt(i)]%2!=0){
            oddcount++;//increments odd count
        }
        }
        //checks whether oddcount<=1 if it is prints palindrome is possible else not possible
        if(oddcount<=1){
            System.out.println("Palindrome is possible");
        }
        else{
            System.out.println("Not Possible");
        }

    }
}
