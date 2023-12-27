import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            Scanner scan = new Scanner(System.in);
            boolean run = true;

            while (run){
                System.out.println("Please enter your next move: ");
                System.out.print("\n1-) Show students.\n2-) Add student.\n3-) Remove student.\n9-) Exit.\n>> ");

                Student testStudent = new Student("Talha", "Genc", 20, 10000000000L, "Computer Science");

                int move = scan.nextInt();

                switch (move){
                    case 1:
                        testStudent.showInformations();
                        break;

                    case 2:
                        Student student = new Student();
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
            System.out.println(e.toString());
        }
    }
}
