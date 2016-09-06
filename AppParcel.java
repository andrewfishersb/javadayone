import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class AppParcel {
  public static void main(String[] args) {
  Console console = System.console();

  System.out.println("Welcome to the Shipping Shop! Enter the length, width, height and weight.");
  String [] strInput = console.readLine().split(", ");
  List<Integer> dimensionArray = new ArrayList<Integer>();
  for(int i =0;i<strInput.length;i++){
     dimensionArray.add(Integer.parseInt(strInput[i]));
  }
  Parcel parcel = new Parcel(dimensionArray.get(0),dimensionArray.get(1),dimensionArray.get(2),dimensionArray.get(3));

  System.out.println("How far will you be shipping this package.");
  int distance = Integer.parseInt(console.readLine());
  System.out.println("Would You like your mail to be sent by: Express, Two Day or First Class.");
  String shipType = console.readLine();
  parcel.determineCost(distance, shipType);
  // System.out.println(parcel.mLength + " " + parcel.mHeight);
  }
}
