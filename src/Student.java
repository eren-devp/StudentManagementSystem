import java.util.Scanner;

public class Student extends Human {
    //region Variables
    private String studentClass;
    private Teacher teacher;
    //endregion

    public Student() throws Exception{
        super();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the student's class:");
        setStudentClass(scanner.nextLine());
    }

    public Student(final String name, final String surname, final int age, final long id, final String studentClass, final Teacher teacher) throws Exception {
        super(name, surname, age, id);

        setStudentClass(studentClass);
        setTeacher(teacher);
    }

    //region Getters-Setters
    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(final String studentClass) throws Exception {
        System.out.println(studentClass);
        if(studentClass.isBlank())
            throw new Exception("Student class cannot be blank!");

        this.studentClass = studentClass;
    }


    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(final Teacher teacher) {
        this.teacher = teacher;
    }
    //endregion

    public void showInformation() {
        super.showInformation();

        System.out.println("Student class: " + studentClass);
        System.out.println("\nStudent's teacher's information:");
        teacher.showInformation();
    }
}
