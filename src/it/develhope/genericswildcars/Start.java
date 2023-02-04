package it.develhope.genericswildcars;
import java.util.ArrayList;
import java.util.List;

public class Start {
    public static void main(String[] args) {

        // double marks coming from Lisa's individual homework
        List<Double> individualMarksListLisa = new ArrayList<>();
        individualMarksListLisa.add(9.0);
        individualMarksListLisa.add(8.0);

        // int marks coming from Jeremy's projects
        List<Integer> projectMarksListJeremy = new ArrayList<>();
        projectMarksListJeremy.add(8);
        projectMarksListJeremy.add(7);

        // calculate the marks averages for Lisa and Jeremy
        double lisaAvg = Student.getAverageMark(individualMarksListLisa);
        double jeremyAvg = Student.getAverageMark(projectMarksListJeremy);

        // create a new List of Student objects and add the 2 Student(s) using the constructor
        List<Student> listOfStudents = new ArrayList<>();
        listOfStudents.add(new Student("Lisa", "Stuart", lisaAvg));
        listOfStudents.add(new Student("Jeremy", "Green", jeremyAvg));

        // print in console all the details about the two Student objects
        System.out.println(listOfStudents.get(0).toString());
        System.out.println(listOfStudents.get(1).toString());

        }
    }