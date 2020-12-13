package OOP;

public class Employee {

    private String firstName;

    private String lastName;

    private long baseSalary;

    private int overTimeHours;

    final int overTimeRate = 50;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Employee(String firstName, String lastName, long baseSalary, int overTimeHours) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.baseSalary = baseSalary;
        this.overTimeHours = overTimeHours;
    }

    public long getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(long baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getOverTimeHours() {
        return overTimeHours;
    }

    public void setOverTimeHours(int overTimeHours) {
        this.overTimeHours = overTimeHours;
    }

    public int getOverTimeRate() {
        return overTimeRate;
    }


    public long getWage() {

        return this.baseSalary + (this.overTimeHours * overTimeRate);

    }

}
