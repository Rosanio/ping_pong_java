import java.util.HashMap;

import java.util.ArrayList;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    System.out.println(isPingPongTest(30));
  }

  public static ArrayList isPingPongTest(Integer countTo) {
    ArrayList<Object> numberArray = new ArrayList<Object>();
    for (Integer i = 1; i <= countTo; i++) {
      if (isDivisibleBy15(i)) {
        numberArray.add("ping-pong");
      }
      else if (isDivisibleBy3(i)) {
        numberArray.add("ping");
      }
      else if (isDivisibleBy5(i)) {
        numberArray.add("pong");
      }
      else {
        numberArray.add(i);
      }
    }
    return numberArray;
  }

  public static Boolean isDivisibleBy3(Integer number) {
    if(number%3 == 0) {
      return true;
    }
    return false;
  }

  public static Boolean isDivisibleBy5(Integer number) {
    if(number%5 == 0) {
      return true;
    }
    return false;
  }

  public static Boolean isDivisibleBy15(Integer number) {
    if(number%15 == 0) {
      return true;
    }
    return false;
  }
}
