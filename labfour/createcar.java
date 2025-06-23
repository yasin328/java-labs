class Car {
String brand ;
String model ;
double price ;
// Constructor
Car (String b, String m, double p) {
brand = b;
model = m;
price = p;
}// Method to display car info
void displayCar () {
System. out .println( "Brand: " + brand );
System. out .println( "Model: " + model );
System. out .println( "Price: $" + price );
}
public static void main (String[] args) {
Car myCar = new Car( "Toyota" , "Corolla" , 20000 );
myCar.displayCar();
}
}
