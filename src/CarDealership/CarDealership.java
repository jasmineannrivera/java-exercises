package CarDealership;

public class CarDealership {

    public static void main(String[] args) {
        Customer newCustomer = new Customer("Ry", 10000, 650);

        Employee newEmployee = new Employee("Chris");

        Vehicle newVehicle = new Vehicle(1100, "Honda", "Civic", "Coupe");

        newCustomer.purchaseCar(newVehicle, newEmployee, false);
    }




}
