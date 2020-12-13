package OOP;

public class EmployeeApp {

    public static void main(String[] args) {

        Employee jazz = new Employee("Jasmine", "Rivera", 1000L, 15);

        Employee mir = new Employee("Mira", "Fawn", 100_000L, 0);



        System.out.printf("%s's wage for this week is: $%d\n", jazz.getFirstName(), jazz.getWage());
        System.out.printf("%s's wage for this week is: $%d", mir.getFirstName(), mir.getWage());
    }
}
