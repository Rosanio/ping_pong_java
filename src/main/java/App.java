import java.util.HashMap;

import java.util.ArrayList;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.*;

public class App {
  public static void main(String[] args) {}

  public static ArrayList isPingPongTest(Integer countTo) {
    ArrayList<Object> numberArray = new ArrayList<Object>();
    for (Integer i = 1; i <= countTo; i++) {
      numberArray.add(i);
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
