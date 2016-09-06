import java.io.Console;

public class CodeTracker{


public static void main(String[] args){
  Console console = System.console();
  System.out.println("How many hours did you code two days ago?");
  Integer twoDays = Integer.parseInt(console.readLine());
  System.out.println("How many hours did you code yesterday?");
  Integer yesterDay = Integer.parseInt(console.readLine());
  System.out.println("How many hours did you code today?");
  Integer toDay = Integer.parseInt(console.readLine());
  int [] total = {twoDays,yesterDay,toDay};
  totalTime(total);
}
  public static void totalTime(int[]nums){
    int hours = 0;
    for(int i=0;i<nums.length;i++){
      hours += nums[i];
    }
    System.out.println("You worked " +hours +" hours");
  }
}
