import org.junit.jupiter.api.Test;
import rikkei.academy.FizzBuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFizzBuzz {
    @Test
    public void testFizzBuzz3(){
        int num = 3;
        String expected = "Fizz" + "" + "ba";
        String result = FizzBuzz.CheckFizzBuzz(num);
        assertEquals(expected,result);
    }
    @Test
    public void testFizzBuzz5(){
        int num = 5;
        String expected = "Buzz" + "" + "năm";
        String result = FizzBuzz.CheckFizzBuzz(num);
        assertEquals(expected,result);
    }
//    @Test
//    public void testFizzBuzz6(){
//        int num = 6;
//        String expected = "Fizz";
//        String result = FizzBuzz.CheckFizzBuzz(num);
//        assertEquals(expected,result);
//    }
//    @Test
//    public void testFizzBuzz10(){
//        int num = 10;
//        String expected = "Buzz";
//        String result = FizzBuzz.CheckFizzBuzz(num);
//        assertEquals(expected,result);
//    }
    @Test
    public void testFizzBuzz15(){
        int num = 15;
        String expected = "FizzBuzz" + "" + "mười năm";
        String result = FizzBuzz.CheckFizzBuzz(num);
        assertEquals(expected,result);
    }
}
