package module64;

public class Manager extends StaffComparator implements Employee {
    private int baseSalary = 42000;

    @Override
    public int getMonthSalary() {
        return (int)(baseSalary + 0.05*getCompanyProfit());
    }

    public int getCompanyProfit() {
        int a = 115;
        int b = 140;
        return (int)(Math.random()*(b-a)+a)*1000;
    }
}
