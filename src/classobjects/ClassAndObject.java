package classobjects;

import java.sql.SQLOutput;

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
    void setMajor(String subject){ //Take major subject for the student and assign it
        major = subject;
    }

    void display(){
        System.out.println("The student name: " + name);
        System.out.println("Student id : " + id);
        System.out.println("Major Subject : " + major);
    }

}
public class ClassAndObject {
    public static void main(String[] args) {
        Student s1, s2; // declare two reference variable to point student type object

    }

}
