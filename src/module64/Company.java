package module64;

import java.util.*;

public class Company {

    private ArrayList<Employee> employers = new ArrayList<>();

    public void hire(Employee staff) {
        employers.add(staff);
    }

    public void hireAll(ArrayList<Employee> staff) {
        for (int i = 0; i <= staff.size() - 1; i++) {
            employers.add(staff.get(i));
        }
    }

    public void fire() {
        Collections.shuffle(employers);
        if (!employers.isEmpty()) {
            employers.remove(0);
        }
    }

    public int getIncome() {
        int rewards = 0;
        for (int i = 0; i <= employers.size() - 1; i++) {
            if (employers.get(i) instanceof Manager)
                rewards += ((Manager) employers.get(i)).getCompanyProfit();
        }
        return rewards;
    }

    List<Employee> getTopSalaryStaff(int count) {
        if (Math.abs(count) <= employers.size()) {
            employers.sort(new StaffComparator());
            ArrayList<Employee> topStaff = new ArrayList<>();
            for (int i = 0; i < Math.abs(count) - 1; i++) {
                topStaff.add(employers.get(i));
            }
            for (Employee employee : topStaff) {
                System.out.println(employee.getMonthSalary());
            }
            return topStaff;
        } else {
            System.out.println("Вы ввели число большее, чем сотрудников компании");
            return null;
        }
    }

    List<Employee> getLowestSalaryStaff(int count) {
        if (Math.abs(count) <= employers.size()) {
            employers.sort(new StaffComparator());
            ArrayList<Employee> lowStaff = new ArrayList<>();
            for (int i = employers.size() - 1; i >= employers.size() - Math.abs(count); i--) {
                lowStaff.add(employers.get(i));
            }
            for (Employee employee : lowStaff) {
                System.out.println(employee.getMonthSalary());
            }
            return lowStaff;
        } else {
            System.out.println("Вы ввели число большее, чем сотрудников компании");
            return null;
        }
    }

    public int getStaffCount(){return employers.size();}

}
