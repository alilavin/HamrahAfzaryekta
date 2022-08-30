import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

public class InputData {

    public static String getNumber(){
        String input;

        System.out.println("please inter your Number to count :");
        System.out.println("Type Exit for exit");

        Scanner scanner=new Scanner(System.in);
        input=scanner.nextLine();

        return input;
    }

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
