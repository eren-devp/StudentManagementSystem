import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            Scanner scan = new Scanner(System.in);
            boolean run = true;

            while (run){
                System.out.println("\nPlease enter your next move: ");
                System.out.print("1-) Show students.\n2-) Add student.\n3-) Remove student.\n9-) Exit.\n>> ");

                Teacher testTeacher = new Teacher("Ece", "Gelal Soyak", 30, 1000000000L, 50000, "Computer Science");
                Student testStudent = new Student("Talha", "Genc", 20, 10000000000L, "Computer Science", testTeacher);

                int move = scan.nextInt();

                switch (move){
                    case 1:
                        testStudent.showInformation();
                        break;

                    case 2:
                        Student student = new Student();
                        break;
                    case 3:
                        break;

                    case 9:
                        run = false;
                        break;

                    default:
                        System.out.println("Please enter a valid move!");
                }
            }
        }
        catch (Exception e){
            System.out.println("Please check your inputs!");
            System.out.println("Error: " + e);
        }
    }
}
