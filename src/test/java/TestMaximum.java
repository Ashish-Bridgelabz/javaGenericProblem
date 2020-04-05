import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {
    //MAXIMUM THREE INTEGERS VALUE
    @Test
    public void givenThreeIntegerValue_FindMaximum_ShouldReturnMaximumValue_WithGenericMethod() {
        Maximum maximum = new Maximum();
        Integer maxInteger[] = {30, 20, 10};
        Assert.assertEquals(maximum.maximumInteger(maxInteger), maxInteger[0]);
    }

    @Test
    public void givenThreeIntegerValue_FindMaximum_ShouldReturnMaximumValue2_WithGenericMethod() {
        Maximum maximum = new Maximum();
        Integer maxInteger[] = {20, 30, 10};
        Assert.assertEquals(maximum.maximumInteger(maxInteger), maxInteger[1]);
    }

    @Test
    public void givenThreeIntegerValue_FindMaximum_ShouldReturnMaximumValue3_WithGenericMethod() {
        Maximum maximum = new Maximum();
        Integer maxInteger[] = {10, 20, 30};
        Assert.assertEquals(maximum.maximumInteger(maxInteger), maxInteger[2]);
    }

    //MAXIMUM THREE FLOATS VALUE
    @Test
    public void givenThreeFloatNumber_WhenProper_MethodShouldReturnTrue_Maximum1() {
        Maximum maximum = new Maximum();
        Float maxFloat[] = { 13.210f,10.11f, 12.12f};
        Assert.assertEquals(maximum.maximumFloat(maxFloat), maxFloat[0]);
    }
    @Test
    public void givenThreeFloatNumberWhenProper_MethodShouldReturnTrue_Maximum2() {
        Maximum maximum = new Maximum();
        Float maxFloat[] = {10.11f, 13.210f,12.12f};
        Assert.assertEquals(maximum.maximumFloat(maxFloat), maxFloat[1]);
    }
    @Test
    public void givenThreeFloatNumber_WhenProper_MethodShouldReturnTrue_Maximum3() {
        Maximum maximum = new Maximum();
        Float maxFloat[] = {10.11f, 12.12f, 13.210f};
        Assert.assertEquals(maximum.maximumFloat(maxFloat), maxFloat[2]);
    }

    //MAXIMUM THREE STRING CHARACTER
    @Test
    public void givenThreeString_WhenProper_MethodShouldReturnMaximum1() {
        Maximum maximum = new Maximum();
        String maxString[] = {"gyan","Dev", "ashish"};
        Assert.assertEquals(maximum.maximumString(maxString), maxString[0]);
    }
    @Test
    public void givenThreeString_WhenProper_MethodShouldReturnMaximum2() {
        Maximum maximum = new Maximum();
        String maxString[] = {"Dev","gyan", "ashish"};
        Assert.assertEquals(maximum.maximumString(maxString), maxString[1]);
    }
    @Test
    public void givenThreeString_WhenProper_MethodShouldReturnMaximum3() {
        Maximum maximum = new Maximum();
        String maxString[] = {"Dev", "ashish","gyan"};
        Assert.assertEquals(maximum.maximumString(maxString), maxString[2]);
    }
}