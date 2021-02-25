package Oscar;

public class Main {

    public static void main(String[] args) {
	// write your code here
    String str = "abba";
        System.out.println(isPalindrome(str));
    }
    public static boolean isPalindrome(String str) {
        // Write your code here.
       //  return str == new StringBuilder(str).reverse().toString();
        str = str.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i =str.length()-1; i >= 0 ;i--){
            sb.append(str.charAt(i));
        }
        return str.equals(sb.toString());
    }
}
