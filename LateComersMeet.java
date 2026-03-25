import java.util.Scanner;
public class LateComersMeet{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //accept the string
        String str = sc.nextLine();
        //Split the String by space
        String[] arr = str.split(" ");
        int count = 0;//set count = 0
        
        //for loop to split the string & to convert the String to Integer
        for(int i=0;i<arr.length;i++){
            String[] hours = arr[i].split(":");
            int hr = Integer.parseInt(hours[0]);//Hours
            int minute = Integer.parseInt(hours[1]);//Minutes
            //condition whether the student came to college within 10, if not count them
            if(hr > 10 || (hr==10 && minute > 0)){
                count++;//counting the late comers
            }
        }
        System.out.println(count);//printing number of late comers
    }
}
