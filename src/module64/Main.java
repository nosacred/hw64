package module64;

public class Main {
    public static void main(String[] args) {

        Company tetis = new Company();

        for (int i = 0; i < 180; i++){
            tetis.hire(new Operator());
        }
        for (int i = 0; i < 80; i++){
            tetis.hire(new Manager());
        }
        for (int i = 0; i < 10; i++){
            tetis.hire(new TopManager(tetis));
        }

        System.out.println(tetis.getStaffCount());
        System.out.println(tetis.getIncome());
        tetis.getTopSalaryStaff(10);
        tetis.getLowestSalaryStaff(-30);

        for (int i =1; i <=135;i++){
            tetis.fire();
        }

        System.out.println(tetis.getStaffCount());
        System.out.println(tetis.getIncome());
        tetis.getTopSalaryStaff(10);
        tetis.getLowestSalaryStaff(-30);

    }
}
