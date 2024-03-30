import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Введите среднюю зарплату: ");
       int averageSalary = scanner.nextInt();
       System.out.print("Введите количество отпускных дней: ");
       int countVacationDays = scanner.nextInt();
       PayCalculator payCalculator = new PayCalculator(averageSalary, countVacationDays);
        System.out.println("Расчет отпускных: " + payCalculator.CalculateSalary(averageSalary, countVacationDays));

    }
}
