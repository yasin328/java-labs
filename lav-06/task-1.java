// Grandfather class
class Grandfather {
void company() {
System.out.println("Grandfather owns a company.");
}
}
// Father class inheriting from Grandfather
class Father extends Grandfather {
void car() {
System.out.println("Father has a car.");
}
}
// Son class inheriting from Father
class Son extends Father {
void hobby() {
System.out.println("Son loves painting.");
}
}
// Main class to test the inheritance
public class MultilevelInheritance {
public static void main(String[] args) {
Son s = new Son();
s.company(); // From Grandfather
s.car(); // From Father
s.hobby(); // From Son
}
}
