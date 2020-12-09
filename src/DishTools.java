public class DishTools {
    //Create a class of static members (variables and methods) called DishTools

    //  - AVERAGE_COST_OF_DISH_IN_CENTS - an integer constant set to 1300
    static int AVERAGE_COST_OF_DISH_IN_CENTS = 1300;

    //  - shoutDishName() - that takes in a Dish object and prints out the name in all caps
    static void shoutDishName(Dish dish) {
        System.out.println(dish.getNameOfDish().toUpperCase());
    }

    //  - analyzeDishCost() - that takes in a Dish object and will print out either “More expensive than average” or “Less expensive than average”, depending on the value of the dish costInCents compared to AVERAGE_COST_OF_DISH_IN_CENTS
    static void analyzeDishCost(Dish dish) {
        if (dish.getCostInCents() > AVERAGE_COST_OF_DISH_IN_CENTS) {
            System.out.println("More expensive than average");
        } else if (dish.getCostInCents() == AVERAGE_COST_OF_DISH_IN_CENTS) {
            System.out.println("Same as average");
        } else {
            System.out.println("Less than average");
        }
    }

    //  - flipRecommendation() - that takes in a Dish object and reverses the wouldRecommend boolean value
    static void flipRecommendation(Dish dish) {
       System.out.println(!dish.isWouldRecommend());
    }

    //Try out the DishTools methods with Dish objects in the DishTest main method
    public static void main(String[] args) {

        }
}
