package Oscar;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String str = "xyz";
        int key = 2;
        String encryptedMessage = caesarCypherEncryptor(str,key);
        System.out.println(encryptedMessage);
    }

    public static String caesarCypherEncryptor(String str, int key) {
        // Write your code here.
        if(str.length() == 0){
            return "";
        }
        String encryptedMessage = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for(int i = 0 ; i < str.length() ; i++){
            char letter = str.charAt(i);
            encryptedMessage += alphabet.charAt((alphabet.indexOf(letter)+key)%alphabet.length());

        }
        return encryptedMessage;
    }

}
