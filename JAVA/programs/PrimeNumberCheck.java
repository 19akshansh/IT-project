import java.util.Scanner;

public class PrimeNumberCheck {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number: ");
    int n = sc.nextInt();
    boolean prime = true;
    if (n <= 1) prime = false;
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        prime = false;
        break;
      }
    }
    if (prime)
      System.out.println("Prime number");
    else
      System.out.println("Not prime");
  }
}
