package hw3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PrintPrimesTest {
	PrintPrimes pp = new PrintPrimes();
	
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testPrintPrimes() {
//        pp.printPrimes(7);
        pp.printPrimes(101);

        
    }


}
