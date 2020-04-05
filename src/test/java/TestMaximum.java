import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {
    @Test
    public void givenThreeIntegerValue_FindMaximum_ShouldReturnMaximumValue_WithGenericMethod() {
        Maximum maximum = new Maximum();
        Integer maximumValue = (Integer) maximum.findMaximum(11, 10, 9);
        Assert.assertEquals((Integer) 11, maximumValue);
    }

    @Test
    public void givenThreeIntegerValue_FindMaximum_ShouldReturnMaximumValue2_WithGenericMethod() {
        Maximum maximum = new Maximum();
        Integer maximumValue = (Integer) maximum.findMaximum(10, 11, 9);
        Assert.assertEquals((Integer) 11, maximumValue);
    }

    @Test
    public void givenThreeIntegerValue_FindMaximum_ShouldReturnMaximumValue3_WithGenericMethod() {
        Maximum maximum = new Maximum();

        Integer maximumValue = (Integer) maximum.findMaximum(10, 9, 11);
        Assert.assertEquals((Integer) 11, maximumValue);
    }

    @Test
    public void givenThreeFloatValue_FindMaximum_ShouldReturnMaximumValue_WithGenericMethod() {
        Maximum maximum = new Maximum();
        Float maximumValue = (Float) maximum.findMaximum(13.210f, 10.11f, 12.2f);
        Assert.assertEquals((Float) 13.210f, maximumValue);
    }

    @Test
    public void givenThreeFloatValue_FindMaximum_ShouldReturnMaximumValue2_WithGenericMethod() {
        Maximum maximum = new Maximum();
        Float maximumValue = (Float) maximum.findMaximum(10.11f, 13.210f, 12.2f);
        Assert.assertEquals((Float) 13.210f, maximumValue);

    }

    @Test
    public void givenThreeFloatValue_FindMaximum_ShouldReturnMaximumValue3_WithGenericMethod() {
        Maximum maximum = new Maximum();
        Float maximumValue = (Float) maximum.findMaximum(10.11f, 12.2f, 13.210f);
        Assert.assertEquals((Float) 13.210f, maximumValue);
    }

    @Test
    public void givenThreeString_FindMaximum_ShouldReturnMaximumString_WithGenericMethod() {
        Maximum maximum = new Maximum();
        String maximumString = (String) maximum.findMaximum("shyam", "abhi", "rahul");
        Assert.assertEquals("shyam", maximumString);
    }

    @Test
    public void givenThreeString_FindMaximum_ShouldReturnMaximumString2_WithGenericMethod() {
        Maximum maximum = new Maximum();
        String maximumString = (String) maximum.findMaximum("abhi", "shyam", "rahul");
        Assert.assertEquals("shyam", maximumString);
    }

    @Test
    public void givenThreeString_FindMaximum_ShouldReturnMaximumString3_WithGenericMethod() {
        Maximum maximum = new Maximum();
        String maximumString = (String) maximum.findMaximum("rahul", "abhi", "shyam");
        Assert.assertEquals("shyam", maximumString);
    }

    @Test
    public void givenThreeIntegerValues_FindMaximum_ShouldReturnMaximumValue_WithGenericClass() {
        Maximum maximum = new Maximum(11, 10, 9);
        Integer maximumValue = (Integer) maximum.findMaximum();
        Assert.assertEquals((Integer) 11, maximumValue);
    }

    @Test
    public void givenThreeIntegerValues_FindMaximum_ShouldReturnMaximumValue2_WithGenericClass() {
        Maximum maximum = new Maximum(10, 11, 9);
        Integer maximumValue = (Integer) maximum.findMaximum();
        Assert.assertEquals((Integer) 11, maximumValue);
    }

    @Test
    public void givenThreeIntegerValues_FindMaximum_ShouldReturnMaximumValue3_WithGenericClass() {
        Maximum maximum = new Maximum(10, 9, 11);
        Integer maximumValue = (Integer) maximum.findMaximum();
        Assert.assertEquals((Integer) 11, maximumValue);
    }

    @Test
    public void givenThreeFloatValue_FindMaximum_ShouldReturnMaximumValue_WithGenericClass() {
        Maximum maximum = new Maximum(11.0f, 10.0f, 9.0f);
        Float maximumValue = (Float) maximum.findMaximum();
        Assert.assertEquals((Float) 11.0f, maximumValue);
    }

    @Test
    public void givenThreeFloatValue_FindMaximum_ShouldReturnMaximumValue2_WithGenericClass() {
        Maximum maximum = new Maximum(10.0f, 11.0f, 9.0f);
        Float maximumValue = (Float) maximum.findMaximum();
        Assert.assertEquals((Float) 11.0f, maximumValue);
    }

    @Test
    public void givenThreeFloatValue_FindMaximum_ShouldReturnMaximumValue3_WithGenericClass() {
        Maximum maximum = new Maximum(9.0f, 10.0f, 11.0f);
        Float maximumValue = (Float) maximum.findMaximum();
        Assert.assertEquals((Float) 11.0f, maximumValue);
    }

    @Test
    public void givenThreeString_FindMaximum_ShouldReturnMaximumString_WithGenericClass() {
        Maximum maximum = new Maximum("shyam", "abhi", "rahul");
        String maximumString = (String) maximum.findMaximum();
        Assert.assertEquals("shyam", maximumString);
    }

    @Test
    public void givenThreeString_FindMaximum_ShouldReturnMaximumString2_WithGenericClass() {
        Maximum maximum = new Maximum("abhi", "shyam", "rahul");
        String maximumString = (String) maximum.findMaximum();
        Assert.assertEquals("shyam", maximumString);
    }

    @Test
    public void givenThreeString_FindMaximum_ShouldReturnMaximumString3_WithGenericClass() {
        Maximum maximum = new Maximum("abhi", "rahul", "shyam");
        String maximumString = (String) maximum.findMaximum();
        Assert.assertEquals("shyam", maximumString);
    }
}