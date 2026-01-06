import java.util.Scanner;

public class LargestOfThree {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a: ");
    int a = sc.nextInt();
    System.out.print("Enter b: ");
    int b = sc.nextInt();
    System.out.print("Enter c: ");
    int c = sc.nextInt();

    int largest = a;
    if (b > largest) largest = b;
    if (c > largest) largest = c;

    System.out.println("Largest = " + largest);
  }
}
