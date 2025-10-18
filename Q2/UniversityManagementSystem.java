package LW_5.Q2.LW_5.Q2;

public class UniversityManagementSystem {
    public static void main(String[] args) {
        Department Applied_Computing = new Department("Applied Computing");
        Department Software = new Department("Software Engineering");

        Degree BET = new Degree("BET", 120);
        Degree ComputerSCi = new Degree("Computer Science",140);

        Course oop = new Course("Object-Oriented Programming", "Ongoing", 80);
        Course physics = new Course("Physics", "Ongoing", 100);

        Lecturer lecturer1 = new Lecturer("Kesavan Selvaraja", "Lecturer");
        lecturer1.setDepartment(Software);
        lecturer1.addCourse(oop);

        Lecturer lecturer2 = new Lecturer("Dr.Lalitha Liyanage", "Senior Lecturer");
        lecturer2.setDepartment(Applied_Computing);
        lecturer2.addCourse(physics);


        Student student1 = new Student("Akila Senavirathne", "ET/2022/049", "2nd Year");
        student1.registerDegree(BET);
        student1.enrollCourse(oop);
        student1.enrollCourse(physics);

        Applied_Computing.appointDepartmentHead(lecturer2);
        Applied_Computing.offerCourse(physics);
        Applied_Computing.addLecturer(lecturer2);

        BET.offercourse(oop);
        BET.offercourse(physics);
        oop.addLecturerInCharge(lecturer1);
        oop.addDegreeBelongsTo(BET);



        System.out.println("----- Department Info -----");
        Applied_Computing.displayInfo();
        System.out.println("------------------------------------");
        System.out.println("----- Deegree Info -----");
        BET.displayInfo();
        System.out.println("------------------------------------");
        System.out.println("----- Course Info -----");
        oop.displayInfo();
        System.out.println("------------------------------------");
        System.out.println("----- Lecturer Info -----");
        lecturer1.displayInfo();
        System.out.println("------------------------------------");
        System.out.println("----- Student Info -----");
        student1.displayInfo();
    }}