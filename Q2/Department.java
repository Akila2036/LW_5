package LW_5.Q2.LW_5.Q2;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.ArrayList;

public class Department {
    private String name;
    private Lecturer departmentHead;
    private ArrayList<Course> coursesOffering;
    private ArrayList<Lecturer> lecturersBelongsTo;

    public Department(String name) {
        this.name = name;
        this.coursesOffering = new ArrayList<>();
        this.lecturersBelongsTo = new ArrayList<>();
    }

    public void displayInfo(){
        System.out.println("Department Name: "+name);
        System.out.println("Courses Offered: ");
        for(Course course:coursesOffering){
            System.out.println("    * "+course.getName());
        }
        System.out.println("Lecturers Belongs to Degree: ");
        for (Lecturer lecturer:lecturersBelongsTo){
            System.out.println("    * "+lecturer.getName());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void appointDepartmentHead(Lecturer lecturer){
        this.departmentHead = lecturer;
    }

    public void displaydepartmentHeadInfo(Lecturer lecturer){
        lecturer.displayInfo();
    }

    public void offerCourse(Course course){
        coursesOffering.add(course);
    }

    public void withdrawCourse(Course course){
        coursesOffering.remove(course);
    }

    public void addLecturer(Lecturer lecturer){
        lecturersBelongsTo.add(lecturer);
    }

    public void removeLecturer(Lecturer lecturer){
        lecturersBelongsTo.remove(lecturer);
    }
}
