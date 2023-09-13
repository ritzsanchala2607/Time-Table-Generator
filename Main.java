import java.util.*;

class Solution {
    private int[] matching;
    private int[] vis;
    protected Map<Integer, Integer> lastMatching; // Store the last matching result for each person

    public Solution() {
        lastMatching = new HashMap<>();
    }

    public boolean solve(int person, int[][] G) {
        for (int job = 0; job < G[0].length; job++) {
            if (G[person][job] == 1 && vis[job] == 0) {
                vis[job] = 1;
                if (matching[job] == -1 || solve(matching[job], G)) {
                    matching[job] = person;
                    lastMatching.put(person, job); // Update the last matching result for this person
                    return true;
                }
            }
        }
        return false;
    }

    public int maximumMatch(int[][] G) {
        int p = G.length;
        int j = G[0].length;
        int ans = 0;
        matching = new int[j];
        Arrays.fill(matching, -1);

        for (int i = 0; i < p; i++) {
            vis = new int[j];
            if (solve(i, G)) {
                ans++;
            }
        }
        return ans;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tc = scanner.nextInt();
        Map<Integer, Integer> lastResults = new HashMap<>(); // Store the last result for each left-side member

        while (tc > 0) {
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            int[][] G = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    G[i][j] = scanner.nextInt();
                }
            }
            Solution obj = new Solution();
            int ans = obj.maximumMatch(G);

            // Update the last result for each left-side member
            for (int i = 0; i < m; i++) {
                lastResults.put(i, obj.lastMatching.getOrDefault(i, -1));
            }

            tc--;
        }

        // Print the last result for each left-side member using a traditional for loop
        System.out.println("Last Matching Results:");
        for (Map.Entry<Integer, Integer> entry : lastResults.entrySet()) {
            System.out.println("Person " + entry.getKey() + " matches with Job " + entry.getValue());
        }
    }
}
