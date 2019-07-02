package demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGRetryFailDemo {
    @Test
    public void test1(){
        System.out.println("Inside test 1");
    }
    @Test
    public void test2(){
        System.out.println("Inside test 2");
    }
//    @Test(retryAnalyzer = listeners.RetryAnalyzer.class)
//    public void test3(){
//        System.out.println("Inside test 3");
//        Assert.assertTrue(0>1);
//    }
}
