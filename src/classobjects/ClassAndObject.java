package classobjects;

//definition of a class named Student
class Student{
    //member variables of the student class

    /*  these member variables are in the default scope.
        because here we did not mention them that they are under
        private or public scope
    */

    String name;
    int id;
    String major;

    //member functions/ method declaration
    void setName(String stName){
        name = stName;

        /*  name of the method is setName.
            And it takes the student name as string and assign to
            name variable.
        */
    }


}

public class ClassAndObject {
    public static void main(String[] args) {
    }

}
