import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runners.Parameterized;
//import org.testng.annotations.BeforeClass;

import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 3/24/2022.
 */
public class CalculatorTest {
   static Calculator c;
    int a;
    int b;
    @BeforeClass
    public static void setUp() throws Exception {
         c= new Calculator();
        System.out.println("from setUp");

    }


    @Test
    public void divOf12and4shouldReturn3()
    {

        int actual= c.divide(12,4);
        assertEquals(3,actual);

    }
    @Test(expected = ArithmeticException.class)
    public void divOf12and0shouldReturnException()
    {

        int actual= c.divide(12,0);
      //  assertEquals(3,actual);

    }
    @Test
    public void sumOf2and2shouldReturn4()
    {

       int actual= c.sum(2,2);
        assertEquals(4,actual);

    }
    @Test
    public void sumOf7and3shouldReturn4()
    {
        int actual= c.sum(7,3);
        assertEquals(10,actual);

    }
    @Test
    public void subOf10and4shouldReturn6()
    {
        int actual= c.sub(10,4);
        assertEquals(6,actual);

    }

    @Test
    public void twoPlus(){
        int actual= c.add(2,2);
        assertEquals(4 ,actual);
    }



}