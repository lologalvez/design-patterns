package salary;

public class HobbitSalaryStrategy implements SalaryStrategy {

    @Override
    public int pay(int baseSalary) {
        return baseSalary - (int) Math.round(baseSalary * 0.50);
    }
}
