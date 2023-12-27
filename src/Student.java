public class Student extends Human {
    //region Variables
    private String studentClass;
    private Teacher teacher;
    //endregion

    public Student() throws Exception{
        super();

        System.out.println("Please enter the student's class:");
        setStudentClass(scanner.nextLine());
    }

    public Student(String name, String surname, int age, long id, String studentClass, Teacher teacher) throws Exception {
        super(name, surname, age, id);

        setStudentClass(studentClass);
        setTeacher(teacher);
    }

    //region Getters-Setters
    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) throws Exception {
        if(studentClass.isBlank())
            throw new Exception("Student class cannot be blank!");

        this.studentClass = studentClass;
    }


    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
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
