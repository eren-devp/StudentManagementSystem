import java.util.Scanner;

public class Student extends Human {
    private String studentClass;


    public Student() throws Exception{
        super();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the student's class:");
        setStudentClass(scanner.nextLine());
    }

    public Student(String name, String surname, int age, long id, String studentClass) throws Exception {
        super(name, surname, age, id);

        setStudentClass(studentClass);
    }


    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) throws Exception {
        if(studentClass.isBlank())
            throw new Exception("Student class cannot be blank!");

        this.studentClass = studentClass;
    }

    public void showInformations() {
        super.showInformations();
        System.out.println("Student class: " + this.studentClass);
    }
}
