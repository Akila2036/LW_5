package LW_5.Q2.LW_5.Q2;

public class Course {
    private String name;
    private String enrollType;
    private int numberOfStudentsEnrolled;
    private Lecturer lecturerInCharge;
    private Degree degreeBelongsTo;

    public Course(String name, String enrollType, int numberOfStudentsEnrolled) {
        this.name = name;
        this.enrollType = enrollType;
        this.numberOfStudentsEnrolled = numberOfStudentsEnrolled;

    }

    public void displayInfo(){
        System.out.println("Course Name: "+name);
        System.out.println("Course Type: "+enrollType);
        System.out.println("Number of Students in the Course: "+numberOfStudentsEnrolled);
        System.out.println("Course in Charge: "+lecturerInCharge.getName());
        System.out.println("Course Related Degree: "+degreeBelongsTo.getName());
    }

    public String getName() {
        return name;
    }

    public String getEnrollType() {
        return enrollType;
    }

    public int getNumberOfStudentsEnrolled() {
        return numberOfStudentsEnrolled;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEnrollType(String enrollType) {
        this.enrollType = enrollType;
    }

    public void setNumberOfStudentsEnrolled(int numberOfStudentsEnrolled) {
        this.numberOfStudentsEnrolled = numberOfStudentsEnrolled;
    }

    public void addLecturerInCharge(Lecturer lecturer) {
        this.lecturerInCharge = lecturer;
    }

    public void  removeLecturerInCharge() {
        this.lecturerInCharge = null;
    }

    public void addDegreeBelongsTo(Degree degree) {
        this.degreeBelongsTo = degree;
    }

    public void removeDegreeBelongsTo() {
        this.degreeBelongsTo = null;
    }
}
