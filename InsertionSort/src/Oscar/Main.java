package Oscar;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] input = {8, 5, 2, 9, 5, 6, 3};
        int[] testList = insertionSort(input);
        System.out.println(Arrays.toString(testList));
    }

    public static int[] insertionSort(int[] array) {
        // Write your code here.
        for(int i = 1; i <array.length ; i++){
            int temp = array[i];
            int j = i-1;

            for( ; j >= 0 && array[j] > temp; j--){
                    array[j + 1] = array[j];
            }
            array[j+1] = temp;
        }

        return array ;
    }
}

/*

i ← 1
while i < length(A)
    x ← A[i]
    j ← i - 1
    while j >= 0 and A[j] > x
        A[j+1] ← A[j]
        j ← j - 1
    end while
    A[j+1] ← x
    i ← i + 1
end while

i ← 1
while i < length(A)
    j ← i
    while j > 0 and A[j-1] > A[j]
        swap A[j] and A[j-1]
        j ← j - 1
    end while
    i ← i + 1
end while
 */