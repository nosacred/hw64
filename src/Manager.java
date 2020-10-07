import java.util.Comparator;

public class Manager implements Employee, Comparator<Employee> {
    private double baseSalary = 42000;

    @Override
    public double getMonthSalary() {
        return baseSalary + 0.05*getCompanyProfit();
    }

    public double getCompanyProfit() {
        int a = 115;
        int b = 140;
        return (int)(Math.random()*(b-a)+a)*1000;
    }

    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getMonthSalary() > o2.getMonthSalary()){
            return -1;
        }
        if (o1.getMonthSalary() < o2.getMonthSalary()){
            return 1;
        }
        return 0;
    }
}
