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
        System.out.println(tetis.getTopSalaryStaff(10));
        System.out.println(tetis.getLowestSalaryStaff(-30));
        for (int i =0; i <=tetis.getStaffCount()/2;i++){
            tetis.fire();
        }
        System.out.println(tetis.getStaffCount());
        System.out.println(tetis.getIncome());
        System.out.println(tetis.getTopSalaryStaff(10));
        System.out.println(tetis.getLowestSalaryStaff(-30));

    }
}
