public class Person {
    public String firstName;
    public String lastName;

    public String sayHello() {
        return String.format("Hello from %s %s!", firstName, lastName);
    }

    public static void main(String[] args) {
        Person jasmine = new Person();
        jasmine.firstName = "Jasmine";
        jasmine.lastName = "Rivera";
        System.out.println(jasmine.sayHello());

        Person brothey = new Person();
        brothey.firstName = "Andre";
        brothey.lastName = "Rivera";
        System.out.println(brothey.sayHello());
    }
}
