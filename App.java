import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    Console console = System.console();
    Vehicle hatchback = new Vehicle(4000, "Subaru", 1994);
    Vehicle suv = new Vehicle(7000, "Ford", 2002);
    Vehicle sedan = new Vehicle(69000, "Tesla", 2016);
    boolean runProgram = true;
    List<Vehicle> allVehicles = new ArrayList<Vehicle>();
    allVehicles.add(hatchback);
    allVehicles.add(suv);
    allVehicles.add(sedan);
    while(runProgram){
      System.out.println("Enter one of the following options: All Vehicles, Search Price, Add a Vehicle or Exit");
      String navigationChoice = console.readLine();
      if (navigationChoice.equalsIgnoreCase("All Vehicles")) {
        for(Vehicle car: allVehicles){
          car.printVehicle();
        }
      } else if (navigationChoice.equalsIgnoreCase("Search Price")) {
        System.out.println("What is your budget?");
        int maxPrice = Integer.parseInt(console.readLine());
        System.out.println("Alright, here's what we have in your price range:");
        for(Vehicle car: allVehicles){
          if(car.worthBuying(maxPrice)){
            car.printVehicle();
          }
        }
      }else if(navigationChoice.equalsIgnoreCase("Add a Vehicle")){
        System.out.println("Enter the Vehicles name");
        String name = console.readLine();
        System.out.println("Enter the Vehicles year");
        int year = Integer.parseInt(console.readLine());
        System.out.println("Enter the Vehicles cost");
        int cost = Integer.parseInt(console.readLine());
        allVehicles.add(new Vehicle(cost,name,year));
      } else if(navigationChoice.equalsIgnoreCase("Exit")){
          runProgram = false;
      }else{
        System.out.println("I'm sorry, we don't recognize your input");
      }
    }

  }
}
