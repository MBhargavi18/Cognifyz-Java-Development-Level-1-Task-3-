import java.util.Scanner;

public class AverageGradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the number of grades
        System.out.println("Enter the number of grades:");
        int numGrades = scanner.nextInt();
        
        // Initialize an array to hold the grades
        double[] grades = new double[numGrades];
        
        // Input each grade
        for (int i = 0; i < numGrades; i++) {
            System.out.println("Enter grade " + (i + 1) + ":");
            grades[i] = scanner.nextDouble();
        }
        
        // Close the scanner
        scanner.close();
        
        // Calculate the average grade
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        double average = sum / numGrades;
        
        // Display the average grade
        System.out.println("The average grade is: " + average);
    }
}
