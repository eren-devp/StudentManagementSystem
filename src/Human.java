import java.util.Scanner;
import java.util.concurrent.atomic.AtomicLong;

abstract class Human {
    //region Variables
    private String name;
    private String surname;
    private int age;
    private long idNumber;
    protected static final AtomicLong idCounter = new AtomicLong();
    protected final long id = idCounter.getAndIncrement();
    //endregion

    public Human() throws Exception {
        setInformation();
    }

    public Human(final String name, final String surname, final int age, final long id) throws Exception {
        setName(name);
        setSurname(surname);
        setAge(age);
        setIdNumber(id);
    }

    //region Getters-Setters
    public String getName() {
        return name;
    }

    public void setName(final String name) throws Exception {
        if(name.isBlank())
            throw new Exception("Name cannot be blank!");

        this.name = name;
    }


    public String getSurname() {
        return surname;
    }

    public void setSurname(final String surname) throws Exception {
        if(surname.isBlank())
            throw new Exception("Surname cannot be blank.");

        this.surname = surname;
    }


    public int getAge() {
        return age;
    }

    public void setAge(final int age) throws Exception {
        if(age <= 0 || age >= 100)
            throw new Exception("Please enter a valid age!");

        this.age = age;
    }


    public long getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(final long idNumber) throws Exception {
        if(idNumber <= 0)
            throw new Exception("Please enter a valid ID number!");

        this.idNumber = idNumber;
    }


    protected void setInformation() throws Exception{
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the name:");
        setName(scanner.nextLine());

        System.out.println("Please enter the surname:");
        setSurname(scanner.nextLine());

        System.out.println("Please enter the age:");
        setAge(scanner.nextInt());

        System.out.println("Please enter the id number:");
        setIdNumber(scanner.nextLong());
    }
    //endregion

    public void showInformation(){
        System.out.println("\nName: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
        System.out.println("Id number: " + id);
    }

    public long getId(){
        return id;
    }
}
