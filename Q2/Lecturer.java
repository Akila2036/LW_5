package LW_5.Q2.LW_5.Q2;

import java.util.ArrayList;

public class Lecturer extends Person {

      private String position;
      private Department department;
      private ArrayList<Course> coursesTeaching;

    public Lecturer(String name, String position) {
        super(name);
        this.position = position;
        this.coursesTeaching = new ArrayList<>();
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: "+super.getName());
        System.out.println("Position: "+position);
        System.out.println("Department: "+ department.getName());
        listCoursesTeaching();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void displayDempartmentInfo(){
        System.out.println("Department Name: "+department.getName());
    }

    public void addCourse(Course course){
        coursesTeaching.add(course);
    }

    public void removeCourse(Course course){
        coursesTeaching.remove(course);
    }

    public void listCoursesTeaching(){
        System.out.println("Course Details: ");
        for (Course course:coursesTeaching){
            System.out.println("* "+course.getName());
        }
    }


}
