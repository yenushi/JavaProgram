package operators;

public class unaryOperators {
    public static void main(String[] args) {
        int var1, var2;
        var1 = 50; // assign 50 into the var1 variable

        var2 = -var1; // - unary operator to invert the sign of thr value of var1
        System.out.println("The var1 = " + var1 + ", var2 = " + var2);

        var2 = ++var1; //pre-incrementing, store previous value , then increase var1 by 1
        System.out.println("The var1 = " + var1 + ", var2 = " + var2);

        var2 = var1++;//post-incrementing, increase var1 by 1, then assign to var2
        System.out.println("The var1 = " + var1 + ", var2 = " + var2);

        var2 = --var1;//pre-decrementing, increase var1 by 1, then assign to var2
        System.out.println("The var1 = " + var1 + ", var2 = " + var2);



    }
}
