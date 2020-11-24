import java.util.Arrays;


public class Warmups {

    public static int countWords(String str) {
        String[] stringArr = str.split(" ");
        return stringArr.length;
    }


    public static int differenceMaxMin(int[] arr) {
        Arrays.sort(arr);
        return (arr[arr.length - 1]) - arr[0];

    }


    public static void main(String[] args) {


    }
}

