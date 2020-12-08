public class NumberOne {
    public static int add(int x, int y) {
        return x + y;
    }

    //Create your multiplication method without the * operator (Hint: a loop might be helpful).
    public static int multiply(int x, int y) {
        int product = 0;
        for (int i = 0; i < y; i++) {
            product += x;
        }
        return product;
    }

    public static int recursion(int x, int y) {
        if (x < y)
            return recursion(y, x);
        else if (y != 0)
            return (x + recursion(x, y - 1));
        else
            return 0;

    }

    public static void main(String[] args) {
        System.out.println(multiply(2, 5));
        System.out.println(recursion(2, 5));
    }
}
