package operators;

public class RelationalOperators {
    public static void main(String[] args) {
        int x = 20;
        int y = 10;
        boolean result;

        result = (x == y); // true when left operand is exactly with right operand
        System.out.println("The result is: " + result);

        result = (x < y); // true when left operand is less than right operand
        System.out.println("The result is: " + result);

        result = (x <= y); // true when left operand is less than or equal right operand
        System.out.println("The result is: " + result);

        result = (x > y); // true when left operand is greater than right operand
        System.out.println("The result is: " + result);

        result = (x >= y); // true when left operand is less than or equal right operand
        System.out.println("The result is: " + result);



    }
}
