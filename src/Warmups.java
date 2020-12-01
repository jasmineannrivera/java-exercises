import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;


public class Warmups {

    public static int countWords(String str) {
        String[] stringArr = str.split(" ");
        return stringArr.length;
    }


    public static int differenceMaxMin(int[] arr) {
        Arrays.sort(arr);
        return (arr[arr.length - 1]) - arr[0];

    }


    //Create an algorithm that takes in a string and returns 'true' if there are no repeating characters in the string, and false if there are repeating characters.
        //hello     { 'h', 'e', 'l', 'l', 'o'}
    public static String noRepeats(String a) {

        for(char b : a.toCharArray()) {
            a = a.substring(1);
            for(char c : a.toCharArray())
                if(b == c)
                    return "your string contains repeating characters!";
        }
        return "your string does not contain repeating characters!";

    }

    public static void count(int n) {
        if (n <= 0) {
            System.out.println("All done!");
            return;
        }
        System.out.println(n);
        count(n - 1);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String userInput = sc.next();
        System.out.println(noRepeats(userInput));

        count(5);

    }
}

