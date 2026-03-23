import java.util.Scanner;
public class CharacterRemove{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //accepts String input
        String str = sc.next();
        //calulates string length
        int n = str.length();
        //no need to use the for loop for it just condition
        if(n > 2){
            //str.substring is a function which is used to remove characters from string
            String result = str.substring(1, str.length()-1);
            //prints result
            System.out.print(result);

    }
}
