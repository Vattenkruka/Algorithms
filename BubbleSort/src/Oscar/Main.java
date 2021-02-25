package Oscar;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] input = {8, 5, 2, 9, 5, 6, 3};
        int[] test = bubbleSort(input);
        System.out.println(Arrays.toString(test));
    }

    public static int[] bubbleSort(int[] array) {
        // Write your code here.
        int n = array.length;
        for(int i = 0; i < n-1 ; i++){
            for(int j = 0; j < n-1-i; j++){
                if(array[j] > array[j+1]){

                    swap(i,j,array);
                }
            }
        }
        return array ;
    }
    public static void swap(int i, int j, int[] array){
        int temp = array[j];
        array[j] = array[j+1];
        array[j+1] = temp;
    }
}
