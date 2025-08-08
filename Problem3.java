//Generates odd number series with special conditions based on input value with two consecutive same series.
import java.util.Scanner;

public class Problem3 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();

        int limit = (a % 2 == 0) ? a - 1 : a;

        int count = 0;  
        int num = 1;    

        while (count < limit) {
            if (num % 2 != 0) {  
                System.out.print(num);
                count++;
                if (count < limit) {
                    System.out.print(", ");
                }
            }
            num++;
        }
        sc.close();
    }
}
