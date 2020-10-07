import java.util.Comparator;

public class TopManager extends StaffComparator implements Employee {

    private int baseSalary = 120000;
    private Company a;

    public TopManager(Company a) {
        this.a = a;
    }

    @Override
    public int getMonthSalary() {
        if(a.getIncome() >= 10000000){
            return (int)(baseSalary+baseSalary*1.5);
        } else {
            return baseSalary;
        }
    }
}
