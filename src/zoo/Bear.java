package zoo;

public class Bear {



    public static void main(String[] args) {
        Animal brownBear = new Animal(2, 360, false, "mammal");
        brownBear.eat();
        brownBear.eat(brownBear.isHerbivore());
    }



}
