import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {
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
}

