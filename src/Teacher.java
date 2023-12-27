import java.util.Vector;
import java.util.Scanner;

public class Teacher extends Human{
    //region Variables
    private int salary;
    private String branch;
    private final Vector<Student> students = new Vector<Student>();
    private static final Vector<Teacher> teachers = new Vector<Teacher>();
    //endregion

    public Teacher() throws Exception {
        super();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the salary:");
        setSalary(scanner.nextInt());
        teachers.addElement(this);
    }

    public Teacher(final String name, final String surname, final int age, final long id, final int salary, final String branch) throws Exception {
        super(name, surname, age, id);

        setSalary(salary);
        setBranch(branch);
        teachers.addElement(this);
    }

    //region Getters-Setters
    public int getSalary() {
        return salary;
    }

    public void setSalary(final int salary) throws Exception {
        if(salary <= 0)
            throw new Exception("Salary must be greater than 0!");

        this.salary = salary;
    }


    public String getBranch() {
        return branch;
    }

    public void setBranch(final String branch) throws Exception {
        if(branch.isBlank())
            throw new Exception("Branch cannot be empty!");

        this.branch = branch;
    }


    public void addStudent(Student student){
        students.addElement(student);
    }

    public static Vector<Teacher> getTeachers(){
        return teachers;
    }
    //endregion

    public void showInformation(){
        super.showInformation();

        System.out.println("Salary: " + this.salary + "\n");
    }

    public void showStudents(){
        if(students.isEmpty()){
            System.out.println("No students found!");
            return;
        }
        for(Student student : students){
            System.out.println("\nName: " + student.getName());
            System.out.println("Surname: " + student.getSurname());
            System.out.println("Student number: " + student.getId());
            System.out.println("Age: " + student.getAge());
            System.out.println("Class/Faculty: " + student.getStudentClass() + "\n");
        }
    }

    public static void printTeachers(){
        for(Teacher teacher : teachers){
            teacher.showInformation();
        }
    }

    public static void removeTeacher(long id){
        teachers.removeIf(teacher -> teacher.getId() == id);
    }
}
