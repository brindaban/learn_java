import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
  @Test
  public void addSingleNo() {
      Calculator myCalculation = Calculator.initilize();
      myCalculation.add(2);
      assertEquals(2,myCalculation.getResult());
  }

  @Test
  public void addMoreThanOneNo() {
      Calculator myCalculation = Calculator.initilize();
      myCalculation.add(2).add(34);
      assertEquals(36,myCalculation.getResult());
  }

  @Test
  public void additionAndSubtruction() {
      Calculator myAnotherCalculation = Calculator.initilize();
      myAnotherCalculation.add(2).sub(10).add(1);
      assertEquals(-7,myAnotherCalculation.getResult());
  }

  @Test
  public void multiplicationWithANo() {
      Calculator myCalculation = Calculator.initilize();
      myCalculation.add(2).multiplication(10);
      assertEquals(20,myCalculation.getResult());
  }

  @Test
  public void divideByANo() {
      Calculator myCalculation = Calculator.initilize();
      myCalculation.add(2).divide(2);
      assertEquals(1,myCalculation.getResult());
  }
}
