package listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNGListenerDemo2 {

    @Test
    public void test5(){
        System.out.println("I'm inside Test 5");
    }
    @Test
    public void test6(){
        System.out.println("I'm inside Test 6");
    }
    @Test
    public void test7(){
        System.out.println("I'm inside Test 7");
        throw new SkipException("This test is skiped");
    }

}
