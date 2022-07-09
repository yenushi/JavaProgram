package string;

public class StringFunction {
    public static void main(String[] args) {
        String str1 = "HELLO";
        String str2 = "Hello";

        // length function to get number of characters in the string
        System.out.println("The length of the string : " + str1 + "is: " +str1.length());

        //equal method to check both strings are same of not (CASE SENSITIVE)
        if(str1.equals(str2))
            System.out.println(str1 + " & " + str2 + "are same");
        else
            System.out.println(str1 + " & " + str2 + " are not same");

        //equal method to check both strings are same of not ( CASE SENSITIVITY will ignore)
        if(str1.equalsIgnoreCase(str2))
            System.out.println(str1 + " & " + " are same (ignoring case sensitive) ");
        else
            System.out.println(str1 + " & " + " are not same (ignoring case sensitive) ");

        //finding character at the given index
        System.out.println("The character at position 2 is : " + str1.charAt(2));

        //compare the first string with second, it returns distance of first mismatched characters
        System.out.println("Comparing " + str1 + " & " + str2 + "Distance : " + str1.compareTo(str2));

        str1 = "INDUDINITHENNAKOON";
        str2 = "JAVA String Function";

        //check whether the string is starts with or ends with given substring or not


    }

}

