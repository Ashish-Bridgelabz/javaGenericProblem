import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {
    //MAXIMUM THREE INTEGERS VALUE
    @Test
    public void givenThreeIntegerValue_FindMaximum_ShouldReturnMaximumValue_WithGenericMethod() {
        Maximum maximum = new Maximum();
        Integer maxInteger[] = {30,20,10};
        Assert.assertEquals(maximum.maximumInteger(maxInteger), maxInteger[0]);
    }
    @Test
    public void givenThreeIntegerValue_FindMaximum_ShouldReturnMaximumValue2_WithGenericMethod() {
        Maximum maximum = new Maximum();
        Integer maxInteger[] = {20,30,10};
        Assert.assertEquals(maximum.maximumInteger(maxInteger), maxInteger[1]);
    }
    @Test
    public void givenThreeIntegerValue_FindMaximum_ShouldReturnMaximumValue3_WithGenericMethod() {
        Maximum maximum = new Maximum();
        Integer maxInteger[] = {10,20,30};
        Assert.assertEquals(maximum.maximumInteger(maxInteger), maxInteger[2]);
    }
    //MAXIMUM THREE FLOATS VALUE
    @Test
    public void givenThreeFloatNumber_WhenProper_MethodShouldReturnTrue() {
        Maximum maximum = new Maximum();
        Float maxFloat[] = {10.11f, 12.12f, 13.210f};
        Assert.assertEquals(maximum.maximumFloat(maxFloat), maxFloat[2]);
    }
    //MAXIMUM THREE STRING CHARACTER
    @Test
    public void givenThreeString_WhenProper_MethodShouldReturnMaximum() {
        Maximum maximum = new Maximum();
        String maxString[] = {"bridgelabz", "accenture", "capgemini"};
        Assert.assertEquals(maximum.maximumString(maxString), maxString[2]);
    }
}

