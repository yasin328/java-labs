import java.util.Scanner;
public class GradeCalculator {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
// Taking input from user
System.out.print("Enter the student's exam marks: ");
int marks = scanner.nextInt();
// Determining grade
char grade;
if (marks >= 90) {
grade = 'A';
} else if (marks >= 80) {
grade = 'B';
} else if (marks >= 70) {
grade = 'C';
} else if (marks >= 60) {
grade = 'D';
} else {
grade = 'F';
}
// Displaying result
System.out.println("The student's grade is: " + grade);
scanner.close();
}
}
