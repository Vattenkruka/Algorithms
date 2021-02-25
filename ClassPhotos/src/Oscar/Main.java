package Oscar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Integer> redShirtHeights = new ArrayList<Integer>(Arrays.asList(5, 8, 1, 3, 4));
        ArrayList<Integer> blueShirtHeights = new ArrayList<Integer>(Arrays.asList(6, 9, 2, 4, 5));

        boolean bob = classPhotos(redShirtHeights,blueShirtHeights);
        System.out.println(bob);
    }

    public static boolean classPhotos(ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {
        Collections.sort(redShirtHeights, Collections.reverseOrder());
        Collections.sort(blueShirtHeights, Collections.reverseOrder());

        String shirtColorInFirstRow = (redShirtHeights.get(0) < blueShirtHeights.get(0)) ? "RED" : "BLUE";

        for(int i = 0; i < redShirtHeights.size() ; i++){
            int redShirtHeight = redShirtHeights.get(i);
            int blueShirtHeight = blueShirtHeights.get(i);

            if(shirtColorInFirstRow == "BLUE"){
                if (redShirtHeight <= blueShirtHeight) {
                    return false;
                }
            }
            else{
                if(redShirtHeight >= blueShirtHeight){
                    return false;
                }
            }

        }
        return true;
    }
}
