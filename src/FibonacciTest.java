import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FibonacciTest {

    @Before
    public void setUp() throws Exception {
        Fibonacci.recursionCount = 0;
    }

    @Test
    public void testFibonacciRecursiveBaseCase() {
        int actualValue = Fibonacci.fibonacciRecursion(1);
        Assert.assertEquals(1, actualValue);
        Assert.assertEquals(1, Fibonacci.recursionCount);
    }

    @Test
    public void testFibonacciRecursiveCase() {
        int actualValue = Fibonacci.fibonacciRecursion(10);
        Assert.assertEquals(55, actualValue);
        Assert.assertEquals(177, Fibonacci.recursionCount);
    }

    @Test
    public void testFibonacciIterative() {
        int actualValue = Fibonacci.fibonacciIteration(10);
        Assert.assertEquals(55, actualValue);
    }
}