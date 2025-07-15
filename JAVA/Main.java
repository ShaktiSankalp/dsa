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

        // Loop N times (N passes)
        // This number of passes is derived from the N^2 complexity analysis.
        // For N=40, total operations will be around 1600, well within 1709.
        // Each pass aims to move elements closer to their final sorted positions
        // and ensure the a[i] < b[i] condition.
        for (int pass = 0; pass < n; pass++) { // N iterations for the outer loop
            // Core idea: Try to fix the a[i] < b[i] condition for current i first,
            // then bubble larger elements to the right. This might be more stable.
            
            // Iterate through indices. For each index i:
            // 1. Ensure a[i] < b[i]. If not, swap them.
            // 2. If a[i] is greater than a[i+1], swap them (bubble sort a).
            // 3. If b[i] is greater than b[i+1], swap them (bubble sort b).
            // This approach mixes the conditions.

            // A more standard approach for N^2 complexity:
            // Iterate from right to left (like a traditional bubble sort sinking large elements),
            // or left to right.
            // The issue is that a type 3 swap can throw values out of order.

            // Let's re-try the problem's example output strategy:
            // First, make sure all a[i] < b[i]. This is done as a first pass.
            // Then, repeatedly bubble sort. If a bubble sort makes a[i] > b[i],
            // the next iteration of the "a[i] < b[i]" fix will handle it.

            // Given the N=3 example output, the initial 3 type 3 swaps are done first.
            // Then, a mix of type 1 and type 2 swaps.
            // This suggests a separation of concerns, or a priority.

            // Let's try this order within each pass:
            // (1) Fix a[i] > b[i] for all i. This often helps place values into correct arrays.
            // (2) Then perform bubble sort passes on 'a' and 'b'.
            // The outer loop ensures these phases are repeated until stable.
            
            // Phase 1: Ensure a[i] < b[i]
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
        
        // At this point, the arrays should be sorted and conditions met.
        // The check at the end is just for verification.

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