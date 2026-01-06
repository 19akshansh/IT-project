import java.util.Scanner;

public class AreaCircle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter radius of the circle: ");
    double r = sc.nextDouble();

    double area = 3.14159 * r * r;
    System.out.println("Area of the circle = " + area);
  }
}
