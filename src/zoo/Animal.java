package zoo;

public class Animal {

    private int age;

    private int weight;

    private boolean isHerbivore;

    String category;

    public Animal(int age, int weight, boolean isHerbivore, String category) {
        this.age = age;
        this.weight = weight;
        this.isHerbivore = isHerbivore;
        this.category = category;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isHerbivore() {
        return isHerbivore;
    }

    public void setHerbivore(boolean herbivore) {
        isHerbivore = herbivore;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void eat() {
        System.out.println("yummyy!");
    }

    public void eat(boolean isHerbivore) {
        if (isHerbivore) {
            System.out.println("yum vegan meal!!");
        } else {
            System.out.println("yum other animal meal!!");
        }
    }

    
}
