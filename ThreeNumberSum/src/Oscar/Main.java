package Oscar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        List<Integer[]> output = threeNumberSum(new int[] {12, 3, 1, 2, -6, 5, -8, 6}, 0);
        for (var value: output
             ) {
            System.out.println(Arrays.toString(value));
        }
    }

    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        // Write your code here.
        int right=0;
        int left= 0;
        if(array.length == 0){
            return new ArrayList<Integer[]>();
        }
        ArrayList<Integer[]> integerArrayList = new ArrayList<>();
        Arrays.sort(array);
        for(int i = 0; i < array.length-2 ; i++){
            left = i+1;
            right = array.length-1;
            while(left < right){
                int currentSum = array[i] +array[left] + array[right];
                if( currentSum == targetSum){
                    integerArrayList.add(new Integer[]{array[i], array[left], array[right]});
                    left++;
                    right--;
                }
                else if( currentSum < targetSum){
                    left++;
                }
                else if( currentSum > targetSum){
                    right--;
                }
            }
        }


        return integerArrayList;
    }
}
