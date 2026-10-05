package Inheritance.EducationalCourse;
// Class to represent common details of a course
public class Course {
    String courseName;
    int duration;
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
    public void displayCourse() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
    }
}