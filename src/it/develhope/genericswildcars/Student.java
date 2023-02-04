package it.develhope.genericswildcars;

import java.util.List;

public class Student {
    String studentName;
    String studentSurname;
    double marksAverage;
    /**
     * Constructor method
     * @param name a String for the Student's name
     * @param surname a String for the Student's surname
     * @param average a double for the Student's marks average
     */
    public Student(String name, String surname, double average) {
        this.studentName = name;
        this.studentSurname = surname;
        this.marksAverage = average;
    }

    /**
     * Static method that takes
     * @param listOfMarks is a List with a lower bound wildcard for Number
     * @return a double value representing the average
     */
    
public static double getAverageMark(List<? extends Number> listOfMarks){
    return(listOfMarks.get(0).doubleValue() + listOfMarks.get(1).doubleValue())/2;
}
    // override of the toString() method
    @Override
    public String toString() {
        return "studentName='" + studentName + '\'' +
                ", studentSurname='" + studentSurname + '\'' +
                ", marksAverage=" + marksAverage +
                '}';
    }

}
