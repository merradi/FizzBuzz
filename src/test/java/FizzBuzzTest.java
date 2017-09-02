import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
	
	@Test
	public void equalsThreeTest(){
		   Assert.assertEquals("fizz", FizzBuzz.getNum(3));
	}
	
	@Test
    public void equalsFiveTest() {
        Assert.assertEquals("buzz", FizzBuzz.getNum(5));
        Assert.assertEquals("buzz", FizzBuzz.getNum(10));
    }
 
    @Test
    public void equalsMultipleThreeFiveTest() {
        Assert.assertEquals("fizzbuzz", FizzBuzz.getNum(15));
        Assert.assertEquals("fizzbuzz", FizzBuzz.getNum(30));
    }
 
    @Test
    public void getResultShouldReturnTheSameNumberIfNoOtherRequirementIsFulfilled() {
        Assert.assertEquals("1", FizzBuzz.getNum(1));
        Assert.assertEquals("2", FizzBuzz.getNum(2));
        Assert.assertEquals("4", FizzBuzz.getNum(4));
    }

}
