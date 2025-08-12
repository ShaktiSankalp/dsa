import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void solve(Scanner scanner) {
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }

        ArrayList<int[]> operations = new ArrayList<>();

        
        for (int pass = 0; pass < n; pass++) { // N iterations for the outer loop
           
            
            for (int i = 0; i < n; i++) {
                if (a[i] > b[i]) {
                    int temp = a[i];
                    a[i] = b[i];
                    b[i] = temp;
                    operations.add(new int[]{3, i + 1});
                }
            }

            // Phase 2: Bubble sort pass for array a
            for (int i = 0; i < n - 1; i++) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    operations.add(new int[]{1, i + 1});
                }
            }

            // Phase 3: Bubble sort pass for array b
            for (int i = 0; i < n - 1; i++) {
                if (b[i] > b[i + 1]) {
                    int temp = b[i];
                    b[i] = b[i + 1];
                    b[i + 1] = temp;
                    operations.add(new int[]{2, i + 1});
                }
            }
        }
      

        System.out.println(operations.size());
        for (int[] op : operations) {
            System.out.println(op[0] + " " + op[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            solve(scanner);
        }
        scanner.close();
    }
}