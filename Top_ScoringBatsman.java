import java.util.Scanner;

public class Top_ScoringBatsman{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       //accept the string
        String str = sc.nextLine();
        //split the string by space
        String[] arr = str.split(" ");
        //set top_scorer as min
        int top_scorer = Integer.MIN_VALUE;
        String Batsman = " ";//batsman name
        //for loop to split the string & to convert the string to integer
        for(int i=0;i<arr.length;i++){
            String[] coma = arr[i].split(",");//string is splited
            int scorer = Integer.parseInt(coma[1]);//String --> Integer
            //condition to check who scored more runs
            if(scorer > top_scorer){
                Batsman = coma[0];//Batsman name who scored more runs
                top_scorer = scorer;//score of batsman

            }
        }
        System.out.println(Batsman);//top_scorer batsman name is printed
    }
}
