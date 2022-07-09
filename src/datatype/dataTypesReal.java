package datatype;

public class dataTypesReal {
    public static void main(String[] args) {
        float myfloat; //floating type data, size 4-bytes

        myfloat = 50.26F; // the letter F or f is needed to represent as float
        System.out.println("The values of myfloat: " + myfloat);

        myfloat = (float) 50/3; //Type casting to change integer to float
        System.out.println("The value of myfloat: " + myfloat);

        double mydouble; //double also floating type data, size 8-bytes
        mydouble = -0.2356;//We can use D or d to represent double
        System.out.println("The value of double: " + mydouble);



    }
}
