import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

/**
 * <h1>Get Data from User and check it</h1>
 *
 * @author  Ali Nourmohammadi
 * @version 1.0
 * @since   2022-08-30
 */

public class InputData {

    /**
     * <p>Get Data from User</p>
     *
     * @return String this return can be digit or "Exit" or etc
     */
    public static String getNumber(){
        String input;

        System.out.println("please inter your Number to count :");
        System.out.println("Type Exit for exit");

        Scanner scanner=new Scanner(System.in);
        input=scanner.nextLine();

        return input;
    }

    /**
     * <p>Check input data for sure that it's a number</p>
     *
     * @return boolean if our input data is a number return true otherwise return false
     */
    public static boolean isNumber(String input){
        try {
            Integer.parseInt(input);
            return true;
        }catch (Exception e){
            return false;

        }
    }

    @Test
    public void testIsNumber(){

        Assert.assertEquals(true,isNumber("0"));
        Assert.assertEquals(true,isNumber("123"));
        Assert.assertEquals(true,isNumber("-5"));
        Assert.assertEquals(false,isNumber("exit"));
        Assert.assertEquals(false,isNumber("sd32"));
        Assert.assertEquals(false,isNumber("ssss"));

    }


}
