import java.util.Scanner;

public class Main{
    //hey kam its trevor good coding
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt(); // Read number of students
        int[] marks = new int[n]; // Array to store marks
        int sum = 0, max = 0, min = 100; // Put in the variables

        // Read marks and calculate sum, max, min with loop
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt(); // Read each mark
            sum += marks[i]; // Add to sum for average
            if (marks[i] > max) max = marks[i]; // Find highest
            if (marks[i] < min) min = marks[i]; // Find lowest
        }

        // Print all results
        System.out.println("Average: " + sum/n + ", Highest: " + max + ", Lowest: " + min);
    }
}