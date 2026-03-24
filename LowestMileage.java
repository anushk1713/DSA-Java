import java.util.Scanner;
public class LowestMileage{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //accepts the String as input
        String str = sc.nextLine();
        //splits space in the string seprates each character
        String[] arr = str.split(" ");
        //min_mileage = MAx_VALUE beacusse we need minimum mileage car
        float min_mileage = Integer.MAX_VALUE;
        //car_name to get name of the which has less mileage
        String car_name = " ";
        //for loop to again split array by @ to seprate car_name & mileage
        for(int i=0;i<arr.length;i++){
            //splits the car_name & mileage
                String[] car = arr[i].split("@");
            //converts string to Float value
                float mileage = Float.parseFloat(car[1]);
            //condition to check mileage < min_mileage
                if(mileage < min_mileage){
                    min_mileage = mileage;//updates the min_mileage
                    car_name = car[0];//assigns car name
                }
        }
        //prints car_name whose mileage is less
        System.out.println(car_name);
    }
}
