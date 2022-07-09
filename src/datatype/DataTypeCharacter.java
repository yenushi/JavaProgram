package datatype;

public class DataTypeCharacter {
    public static void main(String[] args) {
        char mychar; //character type data, size 2-byte

        mychar = 'A'; //direct assign character A with single quote
        System.out.println("The value of mychar: " + mychar); // display the value of mychar

        mychar = 70; //ASCII value of character F
        System.out.println("The value of mychar: " + mychar);

        mychar  = '\u0041'; //unicode Hexadecimal value for integer (From 0000 to FFFF)
        System.out.println("The value of mychar: " + mychar);


    }
}
