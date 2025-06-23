// Superclass Person
class Person {
void displayInfo() {
System.out.println("This is a person.");
}
}
// Doctor subclass
class Doctor extends Person {
void treatPatients() {
System.out.println("Doctor treats patients.");
}
}
// Teacher subclass
class Teacher extends Person {
void teachStudents() {
System.out.println("Teacher teaches students.");
}
}
// Engineer subclass
class Engineer extends Person {
void buildProjects() {
System.out.println("Engineer builds projects.");
}
}
// Main class to test the hierarchy
public class HierarchicalInheritance {
public static void main(String[] args) {
Doctor d = new Doctor();
d.displayInfo();
d.treatPatients();
Teacher t = new Teacher();
t.displayInfo();
t.teachStudents();
Engineer e = new Engineer();
e.displayInfo();
e.buildProjects();
}
}
