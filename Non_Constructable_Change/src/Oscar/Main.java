package Oscar;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] input = new int[] {1,2,5};
        //4
        int bob = nonConstructibleChange(input);
        System.out.println(bob);
    }

    public static int nonConstructibleChange(int[] coins) {
        // Write your code here.
        Arrays.sort(coins);

        int currentChangeCreated= 0;
        for (int value: coins){
            if(value > currentChangeCreated +1){
                return currentChangeCreated+1;
            }
            currentChangeCreated +=value;
        }
        return currentChangeCreated + 1;
    }
}
