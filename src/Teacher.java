public class Teacher extends Human{
    //region Variables
    private int salary;
    private String branch;
    //endregion

    public Teacher() throws Exception {
        super();

        System.out.println("Please enter the salary:");
        setSalary(scanner.nextInt());
    }

    public Teacher(String name, String surname, int age, long id, int salary, String branch) throws Exception {
        super(name, surname, age, id);

        setSalary(salary);
        setBranch(branch);
    }

    //region Getters-Setters
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) throws Exception {
        if(salary <= 0)
            throw new Exception("Salary must be greater than 0!");

        this.salary = salary;
    }



    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) throws Exception {
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
