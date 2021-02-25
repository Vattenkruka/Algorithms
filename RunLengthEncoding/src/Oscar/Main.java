package Oscar;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var input = "AAAAAAAAAAAAABBCCCCDD";
        var test = runLengthEncoding(input);
        System.out.println(test);
    }
    public static String runLengthEncoding(String string) {
        // Write your code here.
        if(string.length() == 0){
            return "";
        }
        int counter = 1;
        StringBuilder sb = new StringBuilder();
        for(int i = 1 ; i <string.length() ; i++){
            char prev = string.charAt(i-1);

            if(prev != string.charAt(i) || counter == 9){
                sb.append(counter +"" + prev);
                counter = 0;
            }
            counter++;
        }

        sb.append(counter + "" + string.charAt(string.length()-1));
        return sb.toString();
    }
}
