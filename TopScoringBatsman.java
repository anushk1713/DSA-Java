//it is also same as the previous problem but in this code we are accepting and spliting and also assigning values in loop itself by running loop from 0 to n
import java.util.Scanner;

public class TopScoringBatsman{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //n is accepted of string size
        int n = sc.nextInt();
        //takes to next line if it is inline
        sc.nextLine();
        //set top_scoring_batsman to min value
        int top_scoring_batsman = Integer.MIN_VALUE;
        //batsman name
        String batsman = "";
        
        //for loop to accept the string vertically & split the string, converting string to integer
        for(int i=0;i<n;i++){
            String str = sc.nextLine();
            String[] coma = str.split(",");//string is splited
            int scorer = Integer.parseInt(coma[1]);//string is converted to integer
            //checks condition scorer > top_scoring_batsman
            if(scorer > top_scoring_batsman){
                top_scoring_batsman = scorer;//top_score value
                batsman = coma[0];//top_scoring batsman name
            }
        }
        System.out.print(batsman);//top_scoring_batsman name
    }
}

