import java.util.Scanner;

public class AreaCube {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter length of a side of the cube(cms): ");
    double a = sc.nextDouble();

    double area = a * a * a;
    System.out.println("Area of the Cube = " + area);
  }
}
