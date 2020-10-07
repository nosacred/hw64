import java.util.Comparator;

public class TopManager implements Employee, Comparator<Employee> {

    private double baseSalary = 120000;
    private Company a;

    public TopManager(Company a) {
        this.a = a;
    }

    @Override
    public double getMonthSalary() {
        if(a.getIncome() >= 10000000){
            return baseSalary+baseSalary*1.5;
        } else {
            return baseSalary;
        }
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
