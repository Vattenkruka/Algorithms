package Oscar;

import Oscar.Models.Position;
import Oscar.Models.Pyramid;
import Oscar.Models.Row;

import java.util.ArrayList;
import java.util.Scanner;

import static Oscar.Utils.generateRandomNumber;
import static Oscar.Utils.validateNumberFormat;


public class Program {
    Position position = new Position();

    //Executes the program
    public Program() {
        int rowCount = handleUserInput();
        int sum = findPathOfLeastResistanceOfPyramid(rowCount);
        System.out.println("Sum of path of least resistance: " + sum);
    }

    //Handles all user input
    private int handleUserInput() {
        int rowCount = 0;
        Scanner scanner = new Scanner(System.in);

        try {

            do {
                System.out.println("Enter the row count for your pyramid: ");
                String userInput = scanner.next();
                rowCount = validateNumberFormat(userInput);
            }
            while (rowCount == -1);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        scanner.close();
        return rowCount;
    }

    //Find the lowest adjacent number per row in regards to position
    private int findLowestNumberPerRow(int[] numbers) {
        int temp = 0;
        int curPositionX = position.getCurrentPosition();
        int curPositionXOffsetOne = curPositionX + 1;
        //Checks if it is the first row
        if (numbers.length == 1) {
            temp = numbers[0];

        }
        // Checks if same position beneath is larger than the position on it's right offset.
        else if (numbers[curPositionX] > numbers[curPositionXOffsetOne]) {
            temp = numbers[curPositionXOffsetOne];
            position.setCurrentPosition(curPositionX + 1);
        }
        /* If the position adjacent down right is larger than the value of the positions straight beneath
            then set temp to the value of the the index beneath.
        */
        else {
            temp = numbers[curPositionX];

        }

        return temp;
    }

    //Creates a pyramid and find the path of least resistance and returns it's sum.
    private int findPathOfLeastResistanceOfPyramid(int rowCount) {
        int amountOfRows = rowCount;
        //Declares pyramid
        Pyramid pyramid = new Pyramid();
        pyramid.rows = new ArrayList<Row>();
        Row row = new Row();
        int sum = 0;

        //Creates the rows of the pyramid
        for (int i = 0; i <= amountOfRows - 1; i++) {
            row.numbers = new int[i + 1];
            //Creates the numbers for each row
            for (int j = 0; j <= i; j++) {

                row.numbers[j] = generateRandomNumber();
                System.out.print(row.numbers[j] + " ");
            }
            sum += findLowestNumberPerRow(row.numbers);

            pyramid.rows.add(i, row);
            System.out.println();
        }

        return sum;
    }
}
