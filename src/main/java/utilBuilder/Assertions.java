package utilBuilder;

import org.testng.Assert;

public class Assertions {

    public static void assertValue(String actual,String expected){
        Assert.assertEquals(actual,expected,"Not equals");
        System.out.println("Actual :: "+actual+"  Expected :: "+expected);
    }

    public static void assertValue(int actual,int expected){
        Assert.assertEquals(actual,expected,"Not equals");
        System.out.println("Actual :: "+actual+"  Expected :: "+expected);
    }

    public static void assertValue(long actual,long expected){
        Assert.assertEquals(actual,expected,"Not equals");
        System.out.println("Actual :: "+actual+"  Expected :: "+expected);
    }
}
