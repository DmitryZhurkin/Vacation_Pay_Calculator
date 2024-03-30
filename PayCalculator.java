public class PayCalculator {
    public int averageSalary;
    public int countVacationDays;
    public PayCalculator (int averageSalary, int countVacationDays) {
        this.averageSalary = averageSalary;
        this.countVacationDays = countVacationDays;
    }
    public PayCalculator () {
    }
    public int CalculateSalary (int averageSalary, int countVacationDays) {
        return averageSalary / 28 * countVacationDays;
    }
}
