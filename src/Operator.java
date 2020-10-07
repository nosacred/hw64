import java.util.Comparator;

public class Operator implements Employee, Comparator<Employee> {

    @Override
    public double getMonthSalary() {
        return 50000;
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
