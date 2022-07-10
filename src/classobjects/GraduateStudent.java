package classobjects;

public class GraduateStudent {
   protected  int id;

    // creates constructor
    public GraduateStudent(int studentId) {
        id = studentId;
    }

}

class StudentEX{

    public static void main(String[] args) {


        GraduateStudent graduateStudent = new GraduateStudent(102);

        System.out.println("ID is: " + graduateStudent.id);

    }


}


