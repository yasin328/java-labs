class Student {
    // Private fields
    private String name;
    private String id;
    private double cgpa;

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getCgpa() {
        return cgpa;
    }
}

// Main class to test Student
public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        student.setName("Yasin");
        student.setId("CSE202501");
        student.setCgpa(3.85);

        System.out.println("Student Information:");
        System.out.println("Name: " + student.getName());
        System.out.println("ID: " + student.getId());
        System.out.println("CGPA: " + student.getCgpa());
    }
}
