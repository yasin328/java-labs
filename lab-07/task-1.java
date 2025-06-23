class Calculator {
// Adding two integers
int add(int a, int b) {
return a + b;
}
// Adding two double values
double add(double a, double b) {
return a + b;
}
// Adding three integers
int add(int a, int b, int c) {
return a + b + c;
}
}
public class CalculatorTest {
public static void main(String[] args) {
Calculator calc = new Calculator();
System.out.println("Addition of two integers: " + calc.add(10, 20));
System.out.println("Addition of two doubles: " + calc.add(5.5, 4.3));
System.out.println("Addition of three integers: " + calc.add(1, 2, 3));
}
}
