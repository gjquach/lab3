import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { 1, 3 };
    assertArrayEquals(new int[]{ 3, 1 }, ArrayExamples.reversed(input1));
  }


  @Test
  public void testReverseInPlace1() {
    int[] input1 = {1, 2, 3, 4, 5 , 6};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{6, 5, 4, 3, 2, 1}, input1);
	}


  @Test
  public void testReversed1() {
    int[] input1 = {1};
    assertArrayEquals(new int[]{1}, ArrayExamples.reversed(input1));
  }


  //New Test Cases with Bugs
  @Test
  public void testAverageWithoutLowest(){
    double[] input1 = {1.0, 5.0, 3,0, 10.0};
    assertEquals(6.0, ArrayExamples.averageWithoutLowest(input1), 0.0001);
  }
}
