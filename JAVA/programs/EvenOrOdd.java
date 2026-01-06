import java.util.Scanner;

public class EvenOrOdd {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();

    if (n == 0)
      System.out.println("0 is neither Odd nor Even!");
    else if (n % 2 == 0)
      System.out.println(n+ " is an Even number");
    else
      System.out.println(n+ " is an Odd number");
  }
}
