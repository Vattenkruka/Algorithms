package Oscar;


public class Utils {

    //Parses the String into an integer and if it can't parse it, returns a default value.
    public static int tryParse(String value, int defaultValue) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return defaultValue;
        }
    }

    //Validates the format of the user input and ensures that the user inputs a positive integer
    public static int validateNumberFormat(String userInput) {

        int rows = tryParse(userInput, 0);
        if (rows <= 0) {
            System.out.println("Wrong format! Please enter a positive integer!");
            return -1;
        }
        return rows;
    }

    //Generates a number between 1-100
    public static int generateRandomNumber() {
        int min = 1;
        int max = 100;
        int randomNumber = (int) (Math.random() * (max - min + 1) + min);
        return randomNumber;
    }

}
