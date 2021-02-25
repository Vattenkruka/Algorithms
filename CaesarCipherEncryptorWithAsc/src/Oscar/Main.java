package Oscar;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String str = "abc";
        int key = -2;
        String encryptedMessage = caesarCypherEncryptor(str,key);
        System.out.println(encryptedMessage);
    }

    public static String caesarCypherEncryptor(String str, int key) {
        // Write your code here.
        if(str.length() == 0){
            return "";
        }
        String encryptedMessage = "";
        str = str.toLowerCase();
        for(int i = 0 ; i < str.length() ; i++){
            char letter = str.charAt(i);
            encryptedMessage += encryptLetter(letter,key);

        }
        return encryptedMessage;
    }
    public static char encryptLetter(char letter,int key){
        int originalPosition = letter-'a';
        int newPosition = (originalPosition+key)%26;
        char newCharacter = (char)('a'+newPosition);
        return newCharacter;
    }

}
