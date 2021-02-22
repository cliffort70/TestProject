package HelloWorld1;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class HelloWorld2 extends TestCase{


    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public HelloWorld2( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( HelloWorld2.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}

