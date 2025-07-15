import java.util.Scanner;


public class Sample {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        int t = scanner.nextInt();

        
        while (t-- > 0) {
            
            int n = scanner.nextInt();

            
            long[] a = new long[n]; 
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextLong();
            }

            
            long diff = 0;
            if (n > 1) {
                diff = a[1] - a[0]; 
            }

            boolean possible = true;

            
            for (int i = 1; i < n - 1; i++) {
                if (a[i + 1] - a[i] != diff) {
                    possible = false;
                    break;
                }
            }

            if (!possible) {
                System.out.println("NO");
                continue; 
            }

           
            long numeratorY = a[0] - diff;
            long denominator = n + 1;

           
            if (numeratorY < 0 || numeratorY % denominator != 0) {
                possible = false;
            } else {
                long y = numeratorY / denominator;

                
                long x = diff + y;
                if (x < 0) {
                    possible = false;
                }
            }

            
            if (possible) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        
        scanner.close();
    }
}
