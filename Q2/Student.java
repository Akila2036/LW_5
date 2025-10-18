package LW_5.Q2.LW_5.Q2;

import java.util.ArrayList;

public  class Student extends Person {
    private String studentId;
    private String year;
    private Degree degree;
    private ArrayList<Course> coursesEnrolled;

    public Student(String name, String studentId, String year) {
        super(name);
        this.studentId = studentId;
        this.year = year;
        this.coursesEnrolled = new ArrayList<>();
    }

    public void displayInfo(){
        System.out.println("Student Name: "+getName());
        System.out.println("Student ID: "+studentId);
        System.out.println("Year: "+year);
        degree.displayInfo();
        listCourseEnrolled();

    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getYear() {
        return year;
    }

    public void registerDegree(Degree degree){
        this.degree=degree;
    }

    public void displayDegreeInfo(){
        System.out.println("Degree Name: "+degree.getName());
    }

    public void enrollCourse(Course course){
        coursesEnrolled.add(course);
    }

    public void unenrollCourse(Course course){
        coursesEnrolled.remove(course);
    }

    public void listCourseEnrolled(){
        System.out.println("Enrolled Courses: ");
        for(Course course:coursesEnrolled){
            System.out.println("* "+course.getName());
        }
    }
}
