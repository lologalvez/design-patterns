import middleEarthling.MiddleEarthling;
import salary.SalaryStrategy;

import java.util.Objects;

public class Fellow {

    private final MiddleEarthling fellow;
    private SalaryStrategy salaryStrategy = null;
    private int balance;

    public Fellow(MiddleEarthling middleEarthling, SalaryStrategy salaryStrategy) {
        this.fellow = middleEarthling;
        this.salaryStrategy = salaryStrategy;
        this.balance = 0;
    }

    public Fellow(MiddleEarthling middleEarthling, SalaryStrategy salaryStrategy, int initialBalance) {
        this.fellow = middleEarthling;
        this.salaryStrategy = salaryStrategy;
        this.balance = initialBalance;
    }

    public void paySalary(int baseSalary) {
        if (this.salaryStrategy != null) this.balance = this.salaryStrategy.pay(baseSalary);
    }

    public int getBalance() {
        return this.balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Fellow fellow1 = (Fellow) o;

        if (balance != fellow1.balance) return false;
        if (!Objects.equals(fellow, fellow1.fellow)) return false;
        return Objects.equals(salaryStrategy.getClass(), fellow1.salaryStrategy.getClass());
    }

    @Override
    public int hashCode() {
        int result = fellow != null ? fellow.hashCode() : 0;
        result = 31 * result + (salaryStrategy != null ? salaryStrategy.hashCode() : 0);
        result = 31 * result + balance;
        return result;
    }

}
