import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        String menu = 
                  "-------------------------MAIN MENU-------------------------" 
                + '\n'
                + "-----------------------------------------------------------"
                + '\n'
                + "1-Display the Array"
                + '\n'
                + "-----------------------------------------------------------"
                + '\n'
                + "2-Display Maximum Value"
                + '\n'
                + "-----------------------------------------------------------"
                + '\n'
                + "3-Display Minimum Value"
                + '\n'
                + "-----------------------------------------------------------"
                + '\n'
                + "4-Display Difference Between Each Element and Average"
                + '\n'
                + "-----------------------------------------------------------"
                + '\n'
                + "5-Display Sum of Elements with Odd-Numbered Indexes"
                + '\n'
                + "-----------------------------------------------------------"
                + '\n'
                + "6-Display Sum of Elements with Even-Numbered Indexes"
                + '\n'
                + "-----------------------------------------------------------"
                + '\n'
                + "7-Exit"
                + '\n'
                + "-----------------------------------------------------------";

        Random rand = new Random();
        Scanner in = new Scanner(System.in);

        //Inputing the size of the array
        System.out.println("Please Enter Size Of The Array: ");
        int sizeOfTheArray = in.nextInt();
        
        // Consuming the space to perevent further input error 
        in.nextLine();

        // Creating array of random integers between [0,100]
        int randomArray[] = new int[sizeOfTheArray];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = rand.nextInt(101);
        }

        // Creating a boolean variable to use in while loop for displaying the menu
        // again after an operation ends.
        boolean loop = true;



        do {
            System.out.println(menu);

            // Taking input from user to choose operation
            System.out.print("Please Choose Your Operation: ");
            int operation = in.nextInt();

            // Consuming the space to perevent further input error 
            in.nextLine();


            if (operation == 1) {
                System.out.println(Arrays.toString(randomArray));
            }

            else if (operation == 2) {
                System.out.println(
                        "\n" + "The maximum value of the array is " + Menu.findMaxValueOfTheArray(randomArray) + "\n");
            }

            else if (operation == 3) {
                System.out.println(
                        "\n" + "The minimum value of the array is " + Menu.findMinValueOfTheArray(randomArray) + "\n");

            }

            else if (operation == 4) {
                Menu.calcAverDifference(randomArray);
            }

            else if (operation == 5) {
                System.out.println(
                        '\n' + "Sum of Elements with Odd-Numbered Indexes: " + sumOddIndex(randomArray) + '\n');
            }

            else if (operation == 6) {
                // Call Method 6
            }

            else if (operation == 7) {
                loop = false;
            }

        } while (loop);

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

    public static int findMaxValueOfTheArray(int[] arr) {
        int maxValue = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    public static int findMinValueOfTheArray(int[] arr) {
        int minValue = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (minValue > arr[i]) {
                minValue = arr[i];
            }
        }
        return minValue;
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
