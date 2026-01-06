import java.util.Scanner;

public class Palindrome {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number: ");
    int n = sc.nextInt();
    int temp = n, rev = 0;
    while (temp != 0) {
      rev = rev * 10 + temp % 10;
      temp /= 10;
    }
    if (rev == n)
      System.out.println("Palindrome");
    else
      System.out.println("Not Palindrome");
  }
}
