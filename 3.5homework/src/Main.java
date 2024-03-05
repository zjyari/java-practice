import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = scanner.nextInt();

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Student ID: ");
            String studentID = scanner.next();
            System.out.print("Student Name: ");
            String studentName = scanner.next();
            System.out.print("Number of Extra Activities: ");
            int numberOfActivities = scanner.nextInt();

            Student student = new Student(studentID, studentName, numberOfActivities);

            for (int j = 0; j < numberOfActivities; j++) {
                System.out.print("Enter Extra Activity " + (j + 1) + ": ");
                String activity = scanner.next();
                student.addExtraActivity(j, activity);
            }

            System.out.println(student.toString());
        }

        scanner.close();
    }
}