//import java.io.Console;
// import java.utils.Array

package com.epicodus.mypackage;

public class Repl{
  public static void main(String[] args){
    Repl repl = new Repl();
    repl.iterateString();
  }
  public static void iterateString(String input, Integer counter) {
    for (Integer index = 0; index <= counter; index++) {
      System.out.println(input);
    }
  }
  public static int[] numberArray(int one, int two, int three){
      int[] nums = {one,two,three};
      return nums;
  }

public static void mixedArray(String word1, String word2, Integer number1, Integer number2){
  List<Object> mixedList = new ArrayList<Object>();
  mixedList.add(word1);
  mixedList.add(number1);
  mixedList.add(word2);
  mixedList.add(number2);
  System.out.println(mixedList);
}

  public static void primeNumbers(Integer userNumber) {
    if (userNumber == 1 || userNumber == 2 || userNumber == 3 || userNumber == 5 || userNumber == 7 || userNumber == 11) {
      System.out.println("That's a prime number!");
    } else if (userNumber % 2 == 0 || userNumber % 3 == 0 || userNumber % 5 == 0 || userNumber % 11 == 0) {
      System.out.println("That't not a prime number.");
    } else {
      System.out.println("That's a prime number!");
    }
  }
}
