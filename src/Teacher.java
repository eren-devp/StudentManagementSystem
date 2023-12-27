import java.util.Scanner;

public class Teacher extends Human{
    //region Variables
    private int salary;
    private String branch;
    //endregion

    public Teacher() throws Exception {
        super();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the salary:");
        setSalary(scanner.nextInt());
    }

    public Teacher(final String name, final String surname, final int age, final long id, final int salary, final String branch) throws Exception {
        super(name, surname, age, id);

        setSalary(salary);
        setBranch(branch);
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
    //endregion

    public void showInformation(){
        super.showInformation();

        System.out.println("Salary: " + this.salary);
    }
}
