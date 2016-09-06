import java.io.Console;

public class AppTriangle {
  public static void main(String[] args) {
  Console console = System.console();

  System.out.println("Enter a length:");
  int userLength1 = Integer.parseInt(console.readLine());

  System.out.println("Enter another length:");
  int userLength2 = Integer.parseInt(console.readLine());

  System.out.println("Enter a final length:");
  int userLength3 = Integer.parseInt(console.readLine());

  Triangle userInput = new Triangle(userLength1, userLength2, userLength3);

  userInput.determineTriangle();
  }
}
