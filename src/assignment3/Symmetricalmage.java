import java.util.Scanner;
import java.util.Random;
public class Symmetricalmage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.print("n (rows)? ");
        int n = sc.nextInt();
        System.out.print("m (cols)? ");
        int m = sc.nextInt();
        
        boolean[][] image = new boolean[n][m];  
        
        int numPoints = (n * m) / 4;
        

        for (int p = 0; p < numPoints; p++) {
            int row = rand.nextInt(n);
            int col = rand.nextInt(m);
    
            image[row][col] = true;
            
            int mirrorCol = (m - 1) - col;
            image[row][mirrorCol] = true;
        }
        
        System.out.println("A randomly generated, symmetrical " + n + " x " + m + " image:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (image[i][j]) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    
}
}

