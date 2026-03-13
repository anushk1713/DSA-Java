import java.util.Scanner;
public class HCFoftwonumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int smaller;
        //checking whether the accpeted input has smaller for next loop
        if(a<b){
            smaller = a;
        }
        else 
            smaller = b;
        int hcf = 0;

        //loop runs from 1 to smaller one
        for(int i=1;i<smaller;i++){
            //checks whether a & b == 0 or not if both are true i value will be stored in the hcf
            if(a%i==0 && b%i==0){
                hcf=i;
            }
        }
        //print hcf
        System.out.print(hcf);
    }
}
