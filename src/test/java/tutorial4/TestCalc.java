package tutorial4;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestCalc{
    @Test
    public void testadd(){
//        Calc clac = new Calc();
//        int result = clac.add(2,3);
        Assertions.assertEquals(10,Calc.add(4,6));
    }
    @Test
    public void testsubstract(){

        Assertions.assertEquals(2,Calc.substract(6,4));
    }

}