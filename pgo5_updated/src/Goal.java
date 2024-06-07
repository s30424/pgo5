public class Goal {
    public int year;
    public int dayNumber;
    public int monthNumber;
    public String name;
    public int bonus;

    public Goal(int year, int dayNumber, int monthNumber, String name, int bonus) {
        this.year = year;
        this.dayNumber = dayNumber;
        this.monthNumber = monthNumber;
        this.name = name;
        this.bonus = bonus;
    }

    public int zwrocBonus() {
        return bonus;}
    public int zwrocRok() {
        return year;}
    public int zwrocMiesiac() {
        return monthNumber;}
}