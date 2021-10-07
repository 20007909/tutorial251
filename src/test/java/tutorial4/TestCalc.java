package tutorial4;

import junit.framework.Assert;
import junit.framework.TestCase;




public class TestCalc extends TestCase {

    public void testadd(){
//        Calc clac = new Calc();
//        int result = clac.add(2,3);
        Assert.assertEquals(10,Calc.add(4,6));
    }
}