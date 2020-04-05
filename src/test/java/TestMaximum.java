import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {
    @Test
    public void givenThreeIntegerValue_FindMaximum_ShouldReturnMaximumValue_WithGenericMethod() {
        Maximum maximum = new Maximum();
        Integer maxInteger[] = {30, 20, 10};
        Assert.assertEquals(maximum.maximumValue(maxInteger), maxInteger[0]);
    }

    @Test
    public void givenThreeIntegerValue_FindMaximum_ShouldReturnMaximumValue2_WithGenericMethod() {
        Maximum maximum = new Maximum();
        Integer maxInteger[] = {20, 30, 10};
        Assert.assertEquals(maximum.maximumValue(maxInteger), maxInteger[1]);
    }

    @Test
    public void givenThreeIntegerValue_FindMaximum_ShouldReturnMaximumValue3_WithGenericMethod() {
        Maximum maximum = new Maximum();
        Integer maxInteger[] = {10, 20, 30};
        Assert.assertEquals(maximum.maximumValue(maxInteger), maxInteger[2]);
    }

    @Test
    public void givenThreeFloatValue_FindMaximum_ShouldReturnMaximumValue_WithGenericMethod() {
        Maximum maximum = new Maximum();
        Float maxFloat[] = { 13.210f,10.11f, 12.12f};
        Assert.assertEquals(maximum.maximumValue(maxFloat), maxFloat[0]);
    }

    @Test
    public void givenThreeFloatValue_FindMaximum_ShouldReturnMaximumValue2_WithGenericMethod() {
        Maximum maximum = new Maximum();
        Float maxFloat[] = {10.11f, 13.210f,12.2f};
        Assert.assertEquals(maximum.maximumValue(maxFloat), maxFloat[1]);
    }

    @Test
    public void givenThreeFloatValue_FindMaximum_ShouldReturnMaximumValue3_WithGenericMethod() {
        Maximum maximum = new Maximum();
        Float maxFloat[] = {10.11f, 12.12f, 13.210f};
        Assert.assertEquals(maximum.maximumValue(maxFloat), maxFloat[2]);
    }

    @Test
    public void givenThreeString_FindMaximum_ShouldReturnMaximumString_WithGenericMethod() {
        Maximum maximum = new Maximum();
        String maxString[] = {"shyam", "abhi", "rahul"};
        Assert.assertEquals(maximum.maximumValue(maxString), maxString[0]);
    }

    @Test
    public void givenThreeString_FindMaximum_ShouldReturnMaximumString2_WithGenericMethod() {
        Maximum maximum = new Maximum();
        String maxString[] = {"abhi","shyam", "rahul"};
        Assert.assertEquals(maximum.maximumValue(maxString), maxString[1]);
    }

    @Test
    public void givenThreeString_FindMaximum_ShouldReturnMaximumString3_WithGenericMethod() {
        Maximum maximum = new Maximum();
        String maxString[] = {"abhi","rahul","shyam"};
        Assert.assertEquals(maximum.maximumValue(maxString), maxString[2]);
    }
}