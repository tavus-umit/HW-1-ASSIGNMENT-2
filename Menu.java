import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        String menu = "-------------------------MAIN MENU-------------------------" + '\n'
                + "-----------------------------------------------------------"
                + '\n'
                + "1-Display Maximum Value"
                + '\n'
                + "-----------------------------------------------------------"
                + '\n'
                + "2-Display Minimum Value"
                + '\n'
                + "-----------------------------------------------------------"
                + '\n'
                + "3-Display Difference Between Each Element and Average"
                + '\n'
                + "-----------------------------------------------------------"
                + '\n'
                + "4-Display Sum of Elements with Odd-Numbered Indexes"
                + '\n'
                + "-----------------------------------------------------------"
                + '\n'
                + "5-Display Sum of Elements with Even-Numbered Indexes"
                + '\n'
                + "-----------------------------------------------------------"
                + '\n'
                + "6-Exit"
                + '\n'
                + "-----------------------------------------------------------";

        Random rand = new Random();

        // Creating array of random integers between [0,100]
        int randomArray[] = new int[101];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = rand.nextInt(101);
        }

        // Creating a boolean variable to use in while loop for displaying the menu
        // again after an operation ends.
        boolean loop = true;

        while (loop) {
            System.out.println(menu);

            // Taking input from user to choose operation
            Scanner in = new Scanner(System.in);
            System.out.print("Please Choose Your Operation: ");
            int operation = in.nextInt();

            if (operation == 1) {
                // Call Method 1
            }

            else if (operation == 2) {
                // Call Method 2

            }

            else if (operation == 3) {
                System.out.println("\n" + Arrays.toString(randomArray));
                Menu.calcAverDifference(randomArray);
            }

            else if (operation == 4) {
                System.out.println(
                        '\n' + "Sum of Elements with Odd-Numbered Indexes: " + sumOddIndex(randomArray) + '\n');
            }

            else if (operation == 5) {
                // Call Method 5
            }

            else if (operation == 6) {
                loop = false;
            }

        }

    }

    public static void calcAverDifference(int[] arr) {
        int sum = 0;
        int[] averDifference = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int average = (sum / arr.length);

        for (int i = 0; i < arr.length; i++) {
            averDifference[i] = (average - arr[i]);
        }

        System.out.println("\n" + "The average of the array is " + average + "\n");

        System.out.println(Arrays.toString(averDifference));
    }

    public static int sumOddIndex(int[] array) {
        int sumOdd = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 1) {
                sumOdd = sumOdd + array[i];
            }
        }

        return sumOdd;
    }

}
