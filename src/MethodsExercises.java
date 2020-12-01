public class MethodsExercises {

    public static int addition(int x, int y) {
        return x + y;
    }

    public static int subtraction(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        for (int i = 1; i < y; i++) {
            x += x;
        }
        return x;
    }

    public static int division(int x, int y) {
        return x / y;
    }

    public static int modulus(int x, int y) {
        return x % y;
    }

    public static void main(String[] args) {
        System.out.println(addition(4, 2));
        System.out.println(subtraction(4, 2));
        System.out.println(multiply(4, 2));
        System.out.println(division(4, 2));
        System.out.println(modulus(4, 2));
    }
}
