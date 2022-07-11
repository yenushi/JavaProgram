package statements;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        char character = myscanner.next().charAt(0); // take the first character from given string

        switch(character){
            case 'A' :
                System.out.println("You have typed letter A");
                break;

            case 'B' :
                System.out.println("You have typed letter B");
                break;

            case 'C' :
                System.out.println("You have typed letter C");
                break;

            case 'D' :
                System.out.println("You have typed letter D");
                break;

            default :
                System.out.println("You have typed letter other than (A, B, C, D) ");
        }
        myscanner.close();
        System.out.println("End of the program");
    }
}
