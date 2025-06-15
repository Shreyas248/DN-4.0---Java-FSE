public class MVCPatternExample {
    public static void main(String[] args) {
        // Create the model
        Student student = new Student("101", "John Doe", "A");

        // Create the view
        StudentView view = new StudentView();

        // Create the controller
        StudentController controller = new StudentController(student, view);

        // Initial display
        controller.updateView();

        // Update student data
        controller.setStudentName("Jane Smith");
        controller.setStudentGrade("A+");

        // Updated display
        controller.updateView();
    }
}
