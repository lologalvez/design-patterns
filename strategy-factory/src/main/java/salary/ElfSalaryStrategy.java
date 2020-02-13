package salary;

public class ElfSalaryStrategy implements SalaryStrategy {

    @Override
    public int pay(int baseSalary) {
        return baseSalary;
    }
}
