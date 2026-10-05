package Inheritance.SchoolSystem;
// Class to run the school system hierarchy program
public class SchoolManagement {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Suriya", 35, "Mathematics");
        Student student = new Student("Adhi", 20, "A");
        Staff staff = new Staff("Ravi", 40);
        teacher.displayRole();
        System.out.println();
        student.displayRole();
        System.out.println();
        staff.displayRole();
    }
}