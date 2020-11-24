public class Warmups {

    public static int countWords(String str) {
        String[] stringArr = str.split(" ");
        return stringArr.length;
    }


    public static void main(String[] args) {
        System.out.println(countWords("Just an example here move along"));
        System.out.println(countWords("This is a test"));
        System.out.println(countWords("What an easy task, right"));
    }
}

