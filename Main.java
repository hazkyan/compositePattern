public class Main {
    public static void main(String[] args) {
        // Create students
        Student s1 = new Student("Alice", "S1001", 5000);
        Student s2 = new Student("Bob", "S1002", 5200);
        Student s3 = new Student("Charlie", "S2001", 4800);

        // Create teachers
        Teacher t1 = new Teacher("Dr. Smith", "Computer Science", 70000);
        Teacher t2 = new Teacher("Prof. Johnson", "Information Technology", 65000);

        // Create departments
        Department csDepartment = new Department("Computer Science Department");
        csDepartment.addUnit(t1);
        csDepartment.addUnit(s1);
        csDepartment.addUnit(s2);

        Department itDepartment = new Department("IT Department");
        itDepartment.addUnit(t2);
        itDepartment.addUnit(s3);

        // Create a College
        College engineeringCollege = new College("College of Engineering");
        engineeringCollege.addUnit(csDepartment);
        engineeringCollege.addUnit(itDepartment);

        // Display details
        engineeringCollege.displayDetails();

        // Total number of students
        System.out.println("\nTotal Students: " + engineeringCollege.getStudentCount());

        // Total budget
        System.out.println("Total Budget: $" + engineeringCollege.getBudget());
    }
}