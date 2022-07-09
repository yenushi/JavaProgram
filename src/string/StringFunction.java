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
            System.out.println(str1 + " & " + str2 + "are not same");


    }

}

