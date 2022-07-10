package control;

public class WhileLoop {
    public static void main(String[] args) {
        int a = 0;
        int sum = 0;

        while(a < 10){ // The while loop checks whether 'a' is less than 10 or not
            System.out.println("The value of a: " + a); //print the value of a
            sum = sum + a; // add a with the sum and assign the result into sum again
            a++; // increase the value of a
        }
        System.out.println("The sum of number from 0 to 9: " + sum);
    }
}
