mport java.util.Scanner;
public class BasicCalculator {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
// Taking input from user
System.out.print("Enter first number: ");
double num1 = scanner.nextDouble();
System.out.print("Enter second number: ");
double num2 = scanner.nextDouble():
System.out.print("Enter an operator (+, -, *, /): ");
char operator = scanner.next().charAt(0):
double result;
switch (operator) {
case '+':
result = num1 + num2;
break;
case '-':
result = num1 - num2;
break;
case '*':
result = num1 * num2;
break;
case '/':
if (num2 != 0) {
result = num1 / num2;
} else {
System.out.println("Error! Division by zero is not allowed.");
return;
}
break;
default:
System.out.println("Invalid operator! Please enter +, -, *, or /.");
return;
}
// Displaying result
System.out.println("Result: " + result):
scanner.close();
}
}
