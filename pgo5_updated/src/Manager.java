import java.util.ArrayList;
import java.util.Calendar;

class Manager extends Employee {
    public Manager(String firstName, String lastName, String adress, String email, String pesel, int employeeYear) {
        super(firstName, lastName, adress, email, pesel, employeeYear);
    }
    public ArrayList<Goal> listaCelow = new ArrayList<>();
    public void addGoals(Goal goal){
        listaCelow.add(goal);
    }
    @Override
    public int pensja(){
        int basicSalary = super.pensja();
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        for(Goal goal : listaCelow){
            if(goal.zwrocRok() == year && goal.zwrocMiesiac() == month){
                basicSalary += goal.zwrocBonus();
            }
        }
        return basicSalary;
    }
}