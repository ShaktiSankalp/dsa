import java.util.Arrays;

class Job {
    char id;
    int deadline;
    int profit;

    public Job(char id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}

public class JobSequencingGreedy {

    public static void scheduleJobs(Job[] jobs) {
        // Step 1: Sort jobs by descending profit
        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);

        // Step 2: Find maximum deadline
        int maxDeadline = 0;
        for (Job job : jobs) {
            maxDeadline = Math.max(maxDeadline, job.deadline);
        }

        // Step 3: Initialize time slots
        char[] result = new char[maxDeadline];
        boolean[] slot = new boolean[maxDeadline];

        // Step 4: Schedule jobs greedily
        int totalProfit = 0;
        for (Job job : jobs) {
            // Try to find a free slot from job.deadline - 1 to 0
            for (int j = Math.min(maxDeadline, job.deadline) - 1; j >= 0; j--) {
                if (!slot[j]) {
                    slot[j] = true;
                    result[j] = job.id;
                    totalProfit += job.profit;
                    break;
                }
            }
        }

        // Output scheduled jobs
        System.out.print("Scheduled jobs: ");
        for (int i = 0; i < maxDeadline; i++) {
            if (slot[i]) System.out.print(result[i] + " ");
        }
        System.out.println("\nTotal Profit: " + totalProfit);
    }

    public static void main(String[] args) {
        Job[] jobs = {
            new Job('a', 2, 100),
            new Job('b', 1, 19),
            new Job('c', 2, 27),
            new Job('d', 1, 25),
            new Job('e', 3, 15)
        };

        scheduleJobs(jobs);
    }
}

