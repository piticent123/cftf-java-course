import org.junit.Assert;
import org.junit.Test;

public class Tests {
	@Test
	public void testSolution() {
		Assert.assertTrue(Task.getRandomNumber() < 10);
	}
}