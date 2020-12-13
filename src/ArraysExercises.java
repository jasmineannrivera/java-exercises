import java.awt.event.PaintEvent;
import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        


        Person[] people = new Person[3];
        people[0] = new Person("Jasmine");
        people[1] = new Person("Serena");
        people[2] = new Person("Andre");

        for(Person peep : people) {
            System.out.println(peep.getName());
        }

        System.out.println("Adding a new person...");

        Person mir = new Person("Mira");

        Person[] updatedPeople = addPerson(people, mir);

        System.out.println("Printing out updated people array...");
        for(Person thisPerson : updatedPeople) {
            System.out.println(thisPerson.getName());
        }


    }


    public static Person[] addPerson(Person[] existingPeople, Person newPeep) {

        // add newPeep to the existing people

        // Using the copy method
         Person[] updatedPeeps = Arrays.copyOf(existingPeople, existingPeople.length + 1);
        // [1, 2, 3 ] ==> [1, 2, 3, 4]  / we want to add to '4', updatePeeps[4]
        updatedPeeps[existingPeople.length] = newPeep;

        // return the newly crafted array with all the peeps inside of it
        return updatedPeeps;
    }



}
