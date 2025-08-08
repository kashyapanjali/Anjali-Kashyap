//Generates a series of odd numbers starting from 1, with the count based on input value.
import java.util.Scanner;

public class Problem2 {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many odd numbers to print: ");
        int a = sc.nextInt();

        int count = 0;  
        int num = 1;    // Start checking from 1

        while (count < a) {
            if (num % 2 != 0) {  // Check if num is odd 
                System.out.print(num + ", ");
                count++;
            }
            num++;
        }
        sc.close();
    }
}
