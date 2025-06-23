class IDCard {
String name;
String id;
String department;
String institution;
// Constructor
IDCard(String n, String i, String d, String inst) {
name = n;
id = i;
department = d;
institution = inst;
}
// Method to display ID card info
void showID() {
System.out.println("Name: " + name);
System.out.println("ID: " + id);
System.out.println("Department: " + department);
System.out.println("Institution: " + institution);
}
public static void main(String[] args) {
IDCard studentID = new IDCard("Yasin", "E243001", "CcE", "IIUC");
studentID.showID();
}
}
