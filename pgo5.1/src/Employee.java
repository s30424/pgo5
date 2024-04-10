import java.util.ArrayList;


public class Employee {
    public String firstName;
    public String lastName;
    public String address;
    public String email;
    public String pesel;
    public int employmentYear;

    public Employee(String firstName, String lastName, String address, String email, String pesel, int employmentYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.pesel = pesel;
        this.employmentYear = employmentYear;
    }
    public ArrayList<Technology> technologies = new ArrayList<>();
        public void addTechnology(Technology technology) {
            technologies.add(technology);
    }
}