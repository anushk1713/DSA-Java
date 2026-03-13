import java.util.Scanner;

public class interlace {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int oddctr, evenctr;

        if (B % 2 == 0) {
            evenctr = B;
        } else {
            evenctr = B - 1;
        }

        if (A % 2 == 1) {
            oddctr = A;
        } else {
            oddctr = A + 1;
        }

        int printcount = 0;
        int totalprintcount = B - A + 1;

        while (printcount < totalprintcount) {

            if (A % 2 == 1) {   // start with odd

                if (oddctr <= B) {
                    System.out.print(oddctr + " ");
                    printcount++;
                    oddctr += 2;
                }

                if (evenctr >= A && printcount < totalprintcount) {
                    System.out.print(evenctr + " ");
                    printcount++;
                    evenctr -= 2;
                }

            } else {   // start with even

                if (evenctr >= A) {
                    System.out.print(evenctr + " ");
                    printcount++;
                    evenctr -= 2;
                }

                if (oddctr <= B && printcount < totalprintcount) {
                    System.out.print(oddctr + " ");
                    printcount++;
                    oddctr += 2;
                }
            }
        }
    }
}