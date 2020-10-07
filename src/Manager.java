import java.util.Comparator;

public class Manager extends StaffComparator implements Employee {
    private int baseSalary = 42000;

    @Override
    public double getMonthSalary() {
        return baseSalary + 0.05*getCompanyProfit();
    }

    public int getCompanyProfit() {
        int a = 115;
        int b = 140;
        return (int)(Math.random()*(b-a)+a)*1000;
    }
}
