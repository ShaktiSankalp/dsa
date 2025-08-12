import java.util.PriorityQueue;

public class OptimalMergeGreedy {

    public static int minMergeCost(int[] files) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add all file sizes to min-heap
        for (int size : files) {
            pq.add(size);
        }

        int totalCost = 0;

        // Continue merging until one file remains
        while (pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();

            int merged = first + second;
            totalCost += merged;

            pq.add(merged);
        }

        return totalCost;
    }

    public static void main(String[] args) {
        int[] files = {20, 30, 10, 5};
        int cost = minMergeCost(files);
        System.out.println("Minimum merge cost: " + cost);  // Output: 115
    }
}

