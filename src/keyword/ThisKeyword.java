package keyword;

class Myclass{
    private int a, b;

    public Myclass(int a, int b){ // constructor parameter name same as member variables
        this.a = a; // this.a points the member variables a. (a=a) is ambiguous, so this keyword is used
        this.b = b;
    }
}

public class ThisKeyword {
}
