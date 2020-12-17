package grades;

import java.util.ArrayList;

public class Student {

    private String name;

    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
        double sum = 0;
        for(int grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public static void main(String[] args) {
        Student jazz = new Student("Jasmine");
        jazz.addGrade(100);
        jazz.addGrade(10);
        jazz.addGrade(88);
        jazz.addGrade(73);
        jazz.addGrade(100);
        jazz.addGrade(100);
        System.out.println(jazz.getGradeAverage());
    }


}
