package string;

import java.util.Scanner;

public class StringTest {

    public static void main(String[] args) {
        char[] charString = {'S','t', 'r' , 'i' , 'n' , 'g'}; //an array of characters

        Scanner scanner = new Scanner (System.in);
        String string = new String(charString); //make string from the characters

        System.out.println("The value of string is: " + string);

        System.out.println("Enter String: ");
        string = scanner.nextLine(); //get the string from the user

    }
}
