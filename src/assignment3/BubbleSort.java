import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many values? ");
        int n = sc.nextInt();
        int[] values = new int[n];
        
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        }
        
        System.out.print("Given values:  ");
        for (int v : values) {
            System.out.print(v + " ");
        }
        System.out.println();
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (values[j] > values[j + 1]) {
                    int temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                }
            }
        }
        
        System.out.print("Sorted values: ");
        for (int v : values) {
            System.out.print(v + " ");
        }
        System.out.println();
        
    
    }
}
