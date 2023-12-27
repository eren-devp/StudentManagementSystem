import java.util.Scanner;

abstract class Human {
    private String name;
    private String surname;
    private int age;
    private long id;


    public Human() throws Exception {
        getInformations();
    }

    public Human(String name, String surname, int age, long id) throws Exception {
        setName(name);
        setSurname(surname);
        setAge(age);
        setId(id);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        if(name.isBlank())
            throw new Exception("Name cannot be blank!");

        this.name = name;
    }


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) throws Exception {
        if(surname.isBlank())
            throw new Exception("Surname cannot be blank.");

        this.surname = surname;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception {
        if(age <= 0 || age >= 100)
            throw new Exception("Please enter a valid age!");

        this.age = age;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) throws Exception {
        if(id <= 0)
            throw new Exception("Please enter a valid ID number!");

        this.id = id;
    }


    protected void getInformations() throws Exception{
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the name:");
        setName(scanner.nextLine());

        System.out.println("Please enter the surname:");
        setSurname(scanner.nextLine());

        System.out.println("Please enter the age:");
        setAge(scanner.nextInt());

        System.out.println("Please enter the id number:");
        setId(scanner.nextLong());
    }

     public void showInformations(){
        System.out.println("Name: " + this.name);
        System.out.println("Surname: " + this.surname);
        System.out.println("Age: " + this.age);
        System.out.println("Id number: " + this.id);
     }
}