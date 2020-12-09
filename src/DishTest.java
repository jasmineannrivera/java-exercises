public class DishTest  {
    public static void main(String[] args) {
        //Refactor code as needed in DishTest to access and modify dish object property values
        Dish dish1 = new Dish(300, "Brisket Tacos", true);
        Dish dish2= new Dish();
        dish2.setCostInCents(300);
        dish2.setNameOfDish("Spaghetti");
        dish2.setWouldRecommend(true);


//        Dish dish2 = new Dish();
//        dish2.costInCents = 300;
//        dish2.nameOfDish = "Brisket Taco";
//        dish2.wouldRecommend = true;
//
//        dish2.printSummary();
//        Dish dish3 = new Dish();
//        dish3.nameOfDish = "Spaghetti";
//        dish3.costInCents = 600;
//        dish3.wouldRecommend = false;

        DishTools.shoutDishName(dish1);
        DishTools.analyzeDishCost(dish1);
        DishTools.flipRecommendation(dish1);

        DishTools.shoutDishName(dish2);
        DishTools.analyzeDishCost(dish2);
        DishTools.flipRecommendation(dish2);
    }
}
