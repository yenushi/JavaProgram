package keyword;

class Myclass{
    private int a, b;

    public Myclass(int a, int b){ // constructor parameter name same as member variables
        this.a = a; // this.a points the member variables a. (a=a) is ambiguous, so this keyword is used
        this.b = b;
    }

    public Myclass(){
        this(0,0); // it will call parameterized constructor with value 0 and 0
    }


}

public class ThisKeyword {
}
