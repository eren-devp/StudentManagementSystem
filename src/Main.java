import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            boolean run = true;

            Teacher testTeacher = new Teacher("Ece", "Gelal Soyak", 30, 1000000000L, 50000, "Computer Science");
            Teacher testTeacher2 = new Teacher("Ecsde", "Gelasdasal Soyak", 30, 1000000000L, 50000, "Computer Science");
            Student testStudent = new Student("Talha", "Genc", 20, 10000000000L, "Computer Science", testTeacher);

            while (run){
                System.out.println("\nPlease enter your next move: ");
                System.out.print("1-) Show students.\n2-) Add student.\n3-) Remove student.\n4-) Show teachers.\n5-) Add teacher.\n6-) Remove teacher.\n9-) Exit.\n>> ");

                int move = scanner.nextInt();

                switch (move){
                    case 1:
                        testTeacher.showStudents();
                        break;

                    case 2:
                        Student student = new Student();

                        break;

                    case 3:
                        System.out.print("Please enter the student number: ");
                        long studentNumber = scanner.nextLong();
                        break;

                    case 4:
                        Teacher.printTeachers();
                        break;

                    case 5:
                        Teacher teacher = new Teacher();
                        break;

                    case 6:
                        System.out.print("Please enter the id of the teacher: ");
                        long teacherID = scanner.nextLong();
                        Teacher.removeTeacher(teacherID);
                        break;

                    case 9:
                        run = false;
                        break;

                    default:
                        System.out.println("Please enter a valid move!");
                        break;
                }
            }
        }
        catch (Exception e){
            System.out.println("Please check your inputs!");
            System.out.println("Error: " + e);
        }
    }
}
