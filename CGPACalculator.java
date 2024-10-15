import java.util.Scanner;

public class CGPACalculator {

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user how many courses they want to calculate
        System.out.print("Enter the number of courses: ");
        int numberOfCourses = scanner.nextInt();

        // Variables to store the total grade points and total credit units
        double totalGradePoints = 0;
        int totalCreditUnits = 0;

        // Loop through each course to get the course name, score, and credit unit
        for (int i = 1; i <= numberOfCourses; i++) {
            // Ask the user to enter the course name
            System.out.print("Enter the name of course " + i + ": ");
            String courseName = scanner.next();  // Just storing course name, not used in calculation

            // Ask the user to enter the credit unit for the course
            System.out.print("Enter credit units for " + courseName + ": ");
            int creditUnits = scanner.nextInt();

            // Ask the user to enter the score for the course
            System.out.print("Enter your score for " + courseName + ": ");
            int score = scanner.nextInt();

            // Determine the grade point based on the score
            int gradePoint;
            if (score >= 70) {
                gradePoint = 5;  // A
            } else if (score >= 60) {
                gradePoint = 4;  // B
            } else if (score >= 50) {
                gradePoint = 3;  // C
            } else if (score >= 45) {
                gradePoint = 2;  // D
            } else if (score >= 40) {
                gradePoint = 1;  // E
            } else {
                gradePoint = 0;  // F
            }

            // Multiply the grade point by the credit units for this course and add to total grade points
            totalGradePoints += gradePoint * creditUnits;

            // Add the credit units to the total credit units
            totalCreditUnits += creditUnits;
        }

        // Close the scanner as we no longer need to take input
        scanner.close();

        // Calculate the CGPA by dividing the total grade points by the total credit units
        double cgpa = totalGradePoints / totalCreditUnits;

        // Print the calculated CGPA
        System.out.printf("Your CGPA is: %.2f\n", cgpa);
    }
}
