//Counts how many numbers in the input array are multiples of each number from 1 to 9.
import java.util.*;

public class Problem4 {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // array input
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //result map
        Map<Integer, Integer> result = new LinkedHashMap<>();

        for(int i = 1; i <= 9; i++) {
            int count = 0;
            for(int num : arr) {
                if(num % i == 0) {
                    count++;
                }
            }
            result.put(i, count);
        }

        // print in this format: {1: x, 2: y, ...}
        StringBuilder formatted = new StringBuilder();
        formatted.append("{");
        for (int i = 1; i <= 9; i++) {
            if (i > 1) {
                formatted.append(", ");
            }
            formatted.append(i).append(": ").append(result.get(i));
        }
        formatted.append("}");
        System.out.println(formatted.toString());
        sc.close();
    }
    
}
