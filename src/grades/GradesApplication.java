package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        //Made a HashMap
        HashMap<String, Student> students = new HashMap<>();

        //Made all them students
        students.put("MiraFawn", new Student("Mir"));
        students.get("MiraFawn").addGrade(100);
        students.get("MiraFawn").addGrade(100);
        students.get("MiraFawn").addGrade(100);
        students.put("JasmineRivera", new Student("Jazz"));
        students.get("JasmineRivera").addGrade(100);
        students.get("JasmineRivera").addGrade(99);
        students.get("JasmineRivera").addGrade(93);
        students.put("NotJasmine", new Student("NotJazz"));
        students.get("NotJasmine").addGrade(90);
        students.get("NotJasmine").addGrade(75);
        students.get("NotJasmine").addGrade(67);
        students.put("NotMira", new Student("NotMir"));
        students.get("NotMira").addGrade(100);
        students.get("NotMira").addGrade(99);
        students.get("NotMira").addGrade(98);


        Scanner scanner = new Scanner(System.in);
        boolean keepGoing = true;

        do {
            System.out.println();
            System.out.println(students.keySet());
            System.out.println("Which student would you like to learn more about?\nSay 'exit' when you are done.\n");
            String userInput = scanner.nextLine().strip();

            if (userInput.equalsIgnoreCase("Exit")){
                keepGoing = false;
                break;
            }
            else if (students.containsKey(userInput.strip())){
                System.out.println(students.get(userInput).getName());
                System.out.println(students.get(userInput).getGradeAverage());
            }
            else {
                System.out.println("This person isn't in the list, try again!");
            }
        }
        while (keepGoing);
    }
}