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

        str1 = "INDUDINITHENNAKOONINDUDINI";
        str2 = "JAVA String Function";

        //check whether the string is starts with or ends with given substring or not
        System.out.println("The string " + str1 + " is starts with (IND)" + str1.startsWith("IND"));
        System.out.println("The string " + str1 + " is ends with (INI)" + str1.endsWith("INI"));

        //finding the location of first and last occurrence of a substring
        System.out.println("First index of (DUD) in " + str1 + " is " + str1.indexOf("DUD"));
        System.out.println("First index of (DUD) in " + str1 + " is " + str1.lastIndexOf("DUD"));

        //replacing a substring with new substring
        System.out.println("Replacing (IND) to (Mishty)" + str1 + " is: " + str1.replace("IND","Mishty"));

        //get substring from a given substring
        System.out.println("Substring of " + str2 + " from 5 to 15 : " + str2.substring(5,11));

        //split the string by using (-) as delimiter
        str1 = "This-is-a-test-string";
        String[] splitArr = str1.split("-");

        System.out.println("The slitted parts are: ");
        for(String split : splitArr) // for each element of split string set
            System.out.println(split);

        //trim the blank spaces from starting and ending of the string
        str2 = "      Lot's of Spaces      ";
        System.out.println("Before Trimming: (" + str2 + ")");


    }

}

