import Fibonacci.Fibonacci;
import org.junit.Assert;
import org.junit.Test;



public class FibTest {
    
    @Test
    public void testFindNthTerm() {
        Fibonacci fib = new Fibonacci();

        // @Test case 1
        int n1 = 8;
        String expected1 = "1 1 2 3 5 8 13 21 ";
        String result1 = fib.findNthTerm(n1);
        Assert.assertEquals(expected1, result1);

        // @Test case 2
        int n2 = 5;
        String expected2 = "1 1 2 3 5 ";
        String result2 = fib.findNthTerm(n2);
        Assert.assertEquals(expected2, result2);

    
        
    }
}



