import java.util.ArrayList;

public class Developer extends Employee {
    ArrayList<Technology> technologies = new ArrayList();
    public Developer(String name, String nazwisko, String adres, String email, String PESEL, int rok) {
        super(name, nazwisko, adres, email, PESEL, rok);
    }
    public void addTechnology(Technology technology){
        technologies.add(technology);
    }

    @Override
    public int pensja() {
        int licznik = 0;
        for (int i = 0; i < technologies.size(); i++) {

            licznik = licznik + technologies.get(i).getBonus();
        }
        return super.pensja() + licznik;
    }
}
