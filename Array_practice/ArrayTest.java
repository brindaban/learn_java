import static org.junit.Assert.assertEquals;
import org.junit.Test;

import java.util.Arrays;


public class ArrayTest {

    @Test
    public void initializeAnArrayWithNoValues() {
      Array myArrayWithUtil = Array.initialize();
      assertEquals(0,myArrayWithUtil.getIntegerArray().length);
      assertEquals(0,myArrayWithUtil.sumAll());
      System.out.println("initialize just a empty array");

    }

    @Test
    public void initializeAnArrayByAnArray() {
      int [] array = {2,3,4};
      Array myArrayWithUtil = Array.initializeByValue(array);
      Arrays.equals(array,myArrayWithUtil.getIntegerArray());
      System.out.println("Initialize an array by an array with some values");
    }

    @Test
    public void pushIntegerValues() {
      Array myArrayWithUtil = Array.initialize();
      assertEquals(0,myArrayWithUtil.getIntegerArray().length);
      myArrayWithUtil.addElement(10);
      myArrayWithUtil.addElement(14);
      myArrayWithUtil.addElement(11);
      int [] expectedResult = {10,14,11};
      Arrays.equals(expectedResult,myArrayWithUtil.getIntegerArray());
      System.out.println("Push in an array");
    }

    @Test
    public void summationAllElements() {
        int [] array = {2,3,4};
        Array myArrayWithUtil = Array.initializeByValue(array);
        assertEquals(9,myArrayWithUtil.sumAll());
        System.out.println("It will give the summation of all elements");
    }

    @Test
    public void largestOfAllElements() {
        int [] array = {2,4,3};
        Array myArrayWithUtil = Array.initializeByValue(array);
        assertEquals(4,myArrayWithUtil.findGreatest());
        System.out.println("It will give the largest of all elements");
    }

    @Test
    public void smallestOfAllElements() {
        int [] array = {2,3,4,1};
        Array myArrayWithUtil = Array.initializeByValue(array);
        assertEquals(1,myArrayWithUtil.findSmallest());
        System.out.println("It will give the smallest of all elements");
    }

    @Test
    public void multiplyAllElementsByANo() {
        int [] array = {2,3,4};
        Array myArrayWithUtil = Array.initializeByValue(array);
        myArrayWithUtil.multiplyAllElementsBy(4);
        int [] expectedResult = {8,12,16};
        Arrays.equals(expectedResult,myArrayWithUtil.getIntegerArray());
        System.out.println("It will multiply all the elements by 4 ");
    }

}
