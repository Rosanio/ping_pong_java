import org.junit.*;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class AppTest {

  @Test
  public void isPingPongTest_forNumberArrayCountingByOne_numberList() {
    App pingPong = new App();
    ArrayList<Object> numberArray = new ArrayList<Object>();
    numberArray.add(1);
    numberArray.add(2);
    assertEquals(numberArray, App.isPingPongTest(2));
  }

  @Test
  public void isDivisibleBy3_forNumberDivisibleBy3_true() {
    App pingPong = new App();
    assertEquals(true, App.isDivisibleBy3(6));
  }

  @Test
  public void isDivisibleBy5_forNumberDivisibleBy5_true() {
    App pingPong = new App();
    assertEquals(true, App.isDivisibleBy5(10));
  }

  @Test
  public void isDivisibleBy15_forNumberDivisibleBy15_true() {
    App pingPong = new App();
    assertEquals(true, App.isDivisibleBy5(30));
  }
}
