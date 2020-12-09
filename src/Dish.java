public class Dish {

    int costInCents;

    String nameOfDish;

    boolean wouldRecommend;

    public void printSummary(){
        System.out.printf("\n Cost: %d \n Name: %s \n Recommended: %b \n", costInCents, nameOfDish, wouldRecommend);
    }


}
