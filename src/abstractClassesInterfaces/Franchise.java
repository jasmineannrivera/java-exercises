package abstractClassesInterfaces;

//I am declaring this class to be an abstract class
public abstract class Franchise {
    //all methods in abstract class are a list of rules or reqs that need to be implemented in any class that **extends** this abstract class

    //if we were to creat a class that extends a Franchise
        //i.e McDonald's on I-10 vs McDonald's on Loop 1604

    //properties (constant values)
    private final String companyName = "McDonalds"; //always the same no matter where we build a franchise location

    //methods
    public abstract void broilStuff(String menuItem);

    public abstract void businessHours(int openTime, int closeTime);

    public abstract boolean isIceCreamMachineWorking();



    //non abstract method - need to write out method body
    public void greetCustomer(){
        System.out.println("Welcome to " + this.companyName);
    }




    //Getter/Setter
    public String getCompanyName() {
        return companyName; //can retrieve this from any class that extends this abstract class even tho it is declared private
    }
}
