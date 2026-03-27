//we can also check palindrome string by XOR gate in the code because XOR removes pair elements 0^0 = 0
//this program only works when string has only odd frequency characters. else it won't work
//it not works for multiple of odd frequency characters
import java.util.Scanner;

public class OneOddCharXOR{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //accept the string
        String str = sc.nextLine();
        //char to store the character
        char  result =  0;
        //loop to find the remove the even pairs 
        for(int i=0;i<str.length();i++){
            result^=str.charAt(i);
        }
        //prints remaining character which is not paired
        System.out.println(result);
    }
}
