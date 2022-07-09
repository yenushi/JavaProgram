package operators;

public class BitwiseOperator {
    public static void main(String[] args) {
        byte val1 = 12;   // 0000 1100
        byte val2 = 10;   // 0000 1010
        byte result;

        /* Bitwise one's complement

           Bitwise one's operator is a unary operator(~) and it's denoted
           using a tilde(~)

            if the bit is 1 it will convert it in to 0
                        1  ~  0
            if the bit is 0 it will convert it into 1
                        0  ~  1

            Ex: finding the bitwise one's complement of 4 (~4)

            - first of all  we have to write 8 bit binary representation of decimal 4

                        4    ---->     0000 0100
                       ~4    ---->     1111 1011
         */

        result = (byte) ~val1; // bitwise one's complement of val1
        System.out.println("The result : " + result);

        result = (byte) (val1 & val2); // bitwise AND operator
        System.out.println("The result : " + result);

        result = (byte) (val1 | val2); // bitwise OR operator
        System.out.println("The result : " + result);







    }
}
