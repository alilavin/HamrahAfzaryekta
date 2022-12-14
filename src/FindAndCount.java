import org.junit.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

/**
 * <h1>Make Menu and Count a number in aaray</h1>
 *
 * @author  Ali Nourmohammadi
 * @version 1.0
 * @since   2022-08-30
 */
public class FindAndCount {
    private final static  int[] numbers= {8,4,5,6,7,4,0,-5,10,-5};

    /**
     * <p>Make Menu</p>
     */
    public static void findAndCount(){

        while (true){
            String input = InputData.getNumber();
            input=input.toLowerCase();
            if(InputData.isNumber(input)){
                long count = countInArray(Integer.parseInt(input));
                System.out.println(" I found "+count+" of this number ( "+input+" )");

            }else if(input.equals("exit")){
                System.out.println("Good Bye...!");
                break;
            }else
                System.out.println("Please type Digit or Exit");

        }
    }


    /**
     * <p>Count number in array</p>
     *
     * @return long this return value shows the desire number in the array
     */
    private static long countInArray(int input){

        IntStream stream = Arrays.stream(numbers);
        return stream.filter(x -> x == input).count();
    }

    @Test
    public void testCountArray(){

        assertEquals(2, countInArray(4));
        assertEquals(2, countInArray(-5));
        assertEquals(1, countInArray(10));
        assertEquals(0, countInArray(2));
    }



}
