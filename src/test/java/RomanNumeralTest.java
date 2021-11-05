import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralTest {

    @Test
    public void testCalculateValueFunctionBestCase(){

        RomanNumeral romanNumeral = new RomanNumeral("I");
        int calcValue = romanNumeral.calculateVale();
        Assertions.assertEquals(1,calcValue);
    }

    @Test
    public void testConvertNumeralStringIntoInt(){

        RomanNumeral romanNumeral = new RomanNumeral("I");
        int stringValue = romanNumeral.numeralInt;
        Assertions.assertEquals(1,stringValue);
    }

    @Test
    public void testOnePlusOne(){

        RomanNumeral romanNumeral = new RomanNumeral("I");
        romanNumeral.nextNumeral = new RomanNumeral("I");
        int addedValues = romanNumeral.calculateVale();
        Assertions.assertEquals(2,addedValues);
    }

    @Test
    public void testOnePlusOneThousand(){

        RomanNumeral romanNumeral = new RomanNumeral("M");
        romanNumeral.nextNumeral = new RomanNumeral("I");
        int addedValues = romanNumeral.calculateVale();
        Assertions.assertEquals(1001,addedValues);
    }

}
