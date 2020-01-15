import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class FizzBuzzTest {
    @Test
    public  void printNum(){
        checkPrint("1", 1);
    }

    private void checkPrint(String s, int i) {
        assertThat(s, is(FizzBuzz.of(i)));
    }

    @Test
    public  void printFizz(){
        checkPrint("Fizz", 3);
    }

    @Test
    public  void printBuzz(){
        checkPrint("Buzz", 5);
    }

    @Test
    public  void printFizzBuzz(){
        checkPrint("FizzBuzz", 15);
    }
}
