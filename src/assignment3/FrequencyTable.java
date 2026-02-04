import java.util.Scanner;
import java.util.Random;

public class FrequencyTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.print("How many dice? ");
        int numDice = sc.nextInt();
        
        int[] freq = new int[6 * numDice + 1];  
   
        for (int roll = 0; roll < 10000; roll++) {
            int total = 0;

            for (int d = 0; d < numDice; d++) {
                total += rand.nextInt(6) + 1;  
            }
            freq[total]++;  
        }
        

        System.out.println("Times each value was rolled with " + numDice + " dice over 10000 rolls");
        for (int sum = numDice; sum <= 6 * numDice; sum++) { 
            System.out.print(sum + ": " + freq[sum] + " ");
        }
        System.out.println();

    }
}
