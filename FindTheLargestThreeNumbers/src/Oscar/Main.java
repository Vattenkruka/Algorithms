package Oscar;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] testList = findThreeLargestNumbers(new int[] {141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7});
        System.out.println(Arrays.toString(testList));
    }

    public static int[] findThreeLargestNumbers(int[] array) {
        // Write your code here.
        int[]threeLargestNumbers = new int[3];
        int largestNumber = Integer.MIN_VALUE;
        int index=0;
        for ( int i = 0 ;i < threeLargestNumbers.length ; i++){
            for(int j = 0 ; j < array.length ; j++){
                if(array[j] >= largestNumber){
                    largestNumber = array[j];
                    index= j;
                }
                if(j == array.length-1){
                    array[index] = Integer.MIN_VALUE;
                    index=0;

                }

            }
            threeLargestNumbers[i] = largestNumber;
            largestNumber = Integer.MIN_VALUE;
        }
        Arrays.sort(threeLargestNumbers);

        return threeLargestNumbers;
    }
}
