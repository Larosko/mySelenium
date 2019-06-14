package listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.TwstNGListeners.class)
public class TestNGListenerDemo {

    @Test
    public void test1(){
        System.out.println("I'm inside Test 1");
    }
    @Test
    public void test2(){
        System.out.println("I'm inside Test 2");
        Assert.assertTrue(false);
    }
    @Test
    public void test3(){
        System.out.println("I'm inside Test 3");
    }
    @Test
    public void test4(){
        System.out.println("I'm inside Test 4");
    }
}
