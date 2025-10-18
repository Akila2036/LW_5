package LW_5.Q2.LW_5.Q2;

import java.util.ArrayList;

public class Degree {
    private  String name;
    private int numberOfStudents;
    private ArrayList<Course> coursesOffering;

    public Degree(String name, int numberOfStudents) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;
        this.coursesOffering = new ArrayList<>();
    }

    public void displayInfo(){
        System.out.println("Degree Name: "+name);
        System.out.println("Number of Students: "+numberOfStudents);
        listCoursesOffering();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public void offercourse(Course course){
        coursesOffering.add(course);
    }
    public void withdrawCourse(Course course){
        coursesOffering.remove(course);
    }

    public void listCoursesOffering(){
        System.out.println("Courses Offering: ");
        for (Course course:coursesOffering){
            System.out.println("* "+course.getName());
        }
    }
}
