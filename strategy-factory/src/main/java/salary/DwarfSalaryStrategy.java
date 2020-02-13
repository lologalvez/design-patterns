package salary;

public class DwarfSalaryStrategy implements SalaryStrategy {

    @Override
    public int pay(int baseSalary) {
        return baseSalary - (int) Math.round(baseSalary * 0.30);
    }
}
