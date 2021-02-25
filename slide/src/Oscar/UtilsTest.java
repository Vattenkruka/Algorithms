package Oscar;

import static Oscar.Utils.generateRandomNumber;
import static Oscar.Utils.validateNumberFormat;
import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    //Tests if the function ValidateNumberFormat() returns a positive integer
    @org.junit.jupiter.api.Test
    void assertThatValidateNumberFormatReturnsAPositiveInteger() {
        String testNumber = "4";
        int number = validateNumberFormat(testNumber);
        assertTrue(number > 0);
    }

    //Tests if the function GenerateRandomNumber() returns a number between 1-100
    @org.junit.jupiter.api.Test
    void assertThatGenerateRandomNumberReturnsANumberBetweenOneAndHundred() {
        int number = generateRandomNumber();
        assertTrue(number > 0 && number < 101);
    }
}