public class Dish {

//    Change all properties in the Dish class to private visibility (printSummary should remain public)

    private int costInCents;

    private String nameOfDish;

    private boolean wouldRecommend;

    // Add getters and setters for these properties (write them manually then erase them and use IntelliJ to write them quickly)


    public Dish(int costInCents, String nameOfDish, boolean wouldRecommend) {
        this.costInCents = costInCents;
        this.nameOfDish = nameOfDish;
        this.wouldRecommend = wouldRecommend;
    }

    public Dish() {
    }

    public String getNameOfDish() {
        return nameOfDish;
    }

    public void setNameOfDish(String nameOfDish) {
        this.nameOfDish = nameOfDish;
    }

    public boolean isWouldRecommend() {
        return wouldRecommend;
    }

    public void setWouldRecommend(boolean wouldRecommend) {
        this.wouldRecommend = wouldRecommend;
    }

    public int getCostInCents() {
        return costInCents;
    }

    public void setCostInCents(int costInCents) {
        this.costInCents = costInCents;
    }

    public void printSummary(){
        System.out.printf("\n Cost: %d \n Name: %s \n Recommended: %b \n", costInCents, nameOfDish, wouldRecommend);
    }


}
