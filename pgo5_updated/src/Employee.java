public class Employee {
    String name;
    String nazwisko;
    String adres;
    String email;
    String PESEL;
    int rok;

    public Employee(String name, String nazwisko, String adres, String email, String PESEL, int rok) {
        this.name = name;
        this.nazwisko = nazwisko;
        this.adres = adres;
        this.email = email;
        this.PESEL = PESEL;
        this.rok = rok;
    }
    public int pensja(){
        return 3000 + (2024 - rok)*1000;
    }
}
