package Oscar;

public class Main {

    public static void main(String[] args) {
        int test;
        test = binarySearch(new int[] {0, 1, 21, 33, 45, 45, 61, 71, 72, 73}, 33);
        System.out.println(test);
    }

    public static int binarySearch(int[] array, int target) {
        // Write your code here.
        int left = 0;
        int right = array.length-1;
        while( left <= right){
            int middle = (left+right)/2;

           if(target> array[middle]){
                left = middle+1;
            }
            else if(target< array[middle]){
                right = middle-1;
            }
            else{
                return middle;
           }
        }
        return -1;
    }

}
