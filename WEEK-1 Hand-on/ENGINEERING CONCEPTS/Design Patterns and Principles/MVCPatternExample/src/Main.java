public class Main {
    public static void main(String[] args) {
        // Create Model (Student)
        Student student = new Student("Supraja", "101", "A+");

        // Create View
        StudentView view = new StudentView();

        // Create Controller
        StudentController controller = new StudentController(student, view);

        // Display original details
        controller.updateView();

        // Update student details via controller
        controller.setStudentName("Veena");
        controller.setStudentGrade("A");

        // Display updated details
        controller.updateView();
    }
}
