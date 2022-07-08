package array;

import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        int[] integer_array = { 10,20,30,40,50}; //five values are stored directly in the array
        float[] float_array = new float[5]; // float type array created whose size is 5
        char[] char_array = new char[5]; // an array of character to store five elements

        Scanner myscanner = new Scanner(System.in);

//        manually assign different float values in the array
        float_array[0] = 2.5F;
        float_array[1] = 45.26F;
        float_array[2] = 5.36F;
        float_array[3] = 85.6F;
        float_array[4] = 9.36F;

        for (int i = 0 ; i < 5; i++){
            System.out.print("Enter character for index ( " + i + "): ");
            char_array[i] = myscanner.nextLine().charAt(0); // take input and store to character array
        }
        System.out.println();

        System.out.print("Items of Integer array: ");
        // display integer array content using for loop
        for (int i = 0 ; i < 5; i++) {
            System.out.print(integer_array[i] + " ");
        }
        System.out.println();

        System.out.print("Items of Float array: ");
        // display float array content using for-each loop
        for (float item: float_array) {
            System.out.print(item + " ");
        }
        System.out.println();

        System.out.print("Items of Float array: ");
        // display character array content using for-each loop
        for (char character: char_array) {
            System.out.print(character + " ");
        }

        myscanner.close();





    }
}
