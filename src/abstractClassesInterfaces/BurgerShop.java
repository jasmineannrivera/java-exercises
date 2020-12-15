package abstractClassesInterfaces;

import java.util.List;

//Burger shop will be the "SA" installation of a Franchise
public class BurgerShop extends Franchise {
    //this will be an actual mcdonalds store.  It has to follow all the rules set in the Franchise abstract class

    //custom properties
    private List<String> menuItems;
    private List<String> menuCategories;
    private int seatingCapacity;
    private int openTime;
    private int closeTime;
    private boolean iceCreamTime;


    //Constructor

    public BurgerShop(List<String> menuItems, List<String> menuCategories, int seatingCapacity, int openTime, int closeTime, boolean iceCreamTime) {
        this.menuItems = menuItems;
        this.menuCategories = menuCategories;
        this.seatingCapacity = seatingCapacity;
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.iceCreamTime = iceCreamTime;
    }

    //Override the methods that have to be written per the Franchise abstract class
    public void broilStuff(String menuItem) {
        System.out.println("the kitchen just cooked up a lovely" + menuItem);
    }

    public void businessHours(int openTime, int closeTime) {
        System.out.println("We are open from " + openTime + " to " + closeTime);
    }

    public boolean isIceCreamMachineWorking() {
        if(this.openTime > 100) {
            return this.iceCreamTime;
        }
        return false;

    }


}
