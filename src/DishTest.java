public class DishTest  {
    public static void main(String[] args) {
        Dish dish1 = new Dish();
        dish1.costInCents = 500;
        dish1.nameOfDish = "Pork Bun";
        dish1.wouldRecommend = true;

        dish1.printSummary();

        Dish dish2 = new Dish();
        dish2.costInCents = 300;
        dish2.nameOfDish = "Brisket Taco";
        dish2.wouldRecommend = true;

        dish2.printSummary();
        Dish dish3 = new Dish();
        dish3.nameOfDish = "Spaghetti";
        dish3.costInCents = 600;
        dish3.wouldRecommend = false;

        DishTools.shoutDishName(dish3);
        DishTools.analyzeDishCost(dish3);
        DishTools.flipRecommendation(dish3);
    }
}
