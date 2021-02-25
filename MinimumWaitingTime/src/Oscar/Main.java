package Oscar;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] queries = new int[]{3, 2, 1, 2, 6};
        int bob = 0;
        bob = minimumWaitingTime(queries);
        System.out.println(bob);
    }

    public static int minimumWaitingTime(int[] queries) {
        // Write your code here.
        Arrays.sort(queries);
        int totalWaitTime = 0;
        for (int i = 0; i < queries.length; i++) {
        int time = queries[i];
        int amountOfQueriesLeft = queries.length -(i + 1);
        totalWaitTime += time * amountOfQueriesLeft;

        }

        return totalWaitTime;
    }
}