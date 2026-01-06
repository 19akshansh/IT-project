import java.util.Scanner;

public class PercentageCalculator {
  public static void main (String[] args) {
    double maxMarks = 500;
    Scanner userInput = new Scanner(System.in);
    System.out.print("Enter Marks Obtained: ");
    double marksObtained = userInput.nextDouble();
    double percentage = (marksObtained/maxMarks)*100;
    System.out.println("Percentage: " + percentage);
  }
}