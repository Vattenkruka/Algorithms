package Oscar;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int fib = getNthFib(6);
        System.out.println(fib);
    }

    //returns the last value of the fibonacci sequence
    public static int getNthFib(int n) {
        int firstNumber = 0;
        int secondNumber = 1;
        int counter = 3;
        int nthNumber = 0;

        while (counter <= n) {
            nthNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nthNumber;
            counter++;
        }
        if (n < 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return nthNumber;
        }
    }

    public static int getNthFibV2(int n) {
        int[] lastTwo = {0, 1};
        int counter = 3;
        while (counter <= n) {
            int nextFib = lastTwo[0] + lastTwo[1];
            lastTwo[0] = lastTwo[1];
            lastTwo[1] = nextFib;
            counter++;
        }
        return n > 1 ? lastTwo[1] : lastTwo[0];
    }

    public static int getNthFibRecursively(int n) {
        if (n == 2) {
            return 1;
        } else if (n == 1) {
            return 0;
        } else {
            return getNthFib(n - 1) + getNthFib(n - 2);
        }
    }
}
