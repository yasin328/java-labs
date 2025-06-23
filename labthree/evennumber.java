import java.util.Scanner;
public class EvenNumbersArray {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter Starting Number: ");
int start = sc.nextInt();
System.out.print("Enter Ending Number: ");
int end = sc.nextInt();
int size = (end - start) / 2 + 1;
int[] evenNumbers = new int[size];
int index = 0;
while (start <= end) {
if (start % 2 == 0) {
evenNumbers[index] = start;
index++;
}
start++;
}
System.out.println("Even Numbers in the Given Range:");
for (int i = 0; i < index; i++) {
System.out.print(evenNumbers[i] + " ");
}
sc.close();
}
