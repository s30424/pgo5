import java.util.ArrayList;

class Tester extends Employee {
    public Tester(String firstName, String lastName, String adress, String email, String pesel, int employeeYear) {
        super(firstName, lastName, adress, email, pesel, employeeYear);
    }
    public ArrayList<String> TestType = new ArrayList<>();
    public void addTestType(String testType){
        TestType.add(testType);
    }
    @Override
    public int pensja() {
        int basicSalary = super.pensja();
        basicSalary +=TestType.size()*300;
        return basicSalary;
    }
}