package Oscar;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] input = {8, 5, 2, 9, 5, 6, 3};
       int[]testList =  selectionSort(input);
        System.out.println(Arrays.toString(testList));
    }

    public static int[] selectionSort(int[] array) {
        // Write your code here.
        if (array.length == 0){
            return new int[]{};
        }
        for(int i = 0 ; i <array.length-1 ; i++){
            int min = i;
            for(int j = i+1 ; j < array.length ; j++){
                if(array[j] < array[min]){
                    min = j;
                }
            }
            if(min != i) {
                swap(i,min, array);
            }
        }

        return array;
    }
    public static void swap(int i, int min, int[] array){
        int temp = array[i];
        array[i] = array[min];
        array[min] = temp;
    }
}
