package control;

public class ForLoop {
    public static void main(String[] args) {
        int sum = 0;

        // for loop assign value of 'a' and checks the condition. also increment 'a'
        for(int a =0; a < 10; a ++){
            System.out.println("The value of a : " + a); // print the value of 'a'
            sum = sum + a; // add 'a' with the sum and assign the resul into sum again
        }
        System.out.println("The sum of number from 0 tp 9: " + sum );
    }

}
