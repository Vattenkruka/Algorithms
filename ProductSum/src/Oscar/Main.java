package Oscar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Object> test =
                new ArrayList<Object>(
                        Arrays.asList(
                                5,
                                2,
                                new ArrayList<Object>(Arrays.asList(7, -1)),
                                3,
                                new ArrayList<Object>(
                                        Arrays.asList(6, new ArrayList<Object>(Arrays.asList(-13, 8)), 4))));
        int sum = 0;
        sum = productSum(test);
        System.out.println(sum);
    }

    public static int productSum(List<Object> array) {
        // Write your code here.
        int productSum = productSum(array,1);
        return productSum;
    }
    public static int productSum(List<Object> array, int multiplier) {
    int sum =0;

        for (Object object : array
        ) {
            if (object instanceof Integer) {
                sum += (Integer) object;
                System.out.println("Object " +object);
            } else {
                @SuppressWarnings("unchecked")
                List<Object>list = (List<Object>)object;
                sum += productSum(list,multiplier+1);
            }
        }
        return sum*multiplier;
    }
}
