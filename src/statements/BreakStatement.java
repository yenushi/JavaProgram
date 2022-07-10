package statements;

public class BreakStatement {
    public static void main(String[] args) {
        int a = 0;

        while(true) { // infinite loop using while
            System.out.println("The value of a: " + a); //print the value of a

            //when the value of 'a' is 10, come out from the loop with break statement
            if (a == 10)
                break;
            a++; // increase the value of 'a'
        }
    }
}

