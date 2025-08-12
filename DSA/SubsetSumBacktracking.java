import java.util.*;

public class SubsetSumBacktracking{
    static void findSubsets(int[] arr, int index, int currentSum, int targetSum, List<Integer> subset) {
        if (currentSum == targetSum) {
            System.out.println(subset);
            return;
        }

        if (index >= arr.length || currentSum > targetSum) {
            return;
        }

        // Include arr[index]
        subset.add(arr[index]);
        findSubsets(arr, index + 1, currentSum + arr[index], targetSum, subset);

        // Backtrack (exclude arr[index])
        subset.remove(subset.size() - 1);
        findSubsets(arr, index + 1, currentSum, targetSum, subset);
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 5, 18, 12, 20, 15};
        int targetSum = 35;

        System.out.println("Subsets with sum " + targetSum + ":");
        findSubsets(arr, 0, 0, targetSum, new ArrayList<>());
    }
}
