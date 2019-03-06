import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateNumberTest {
    //given
    CalculateNumber calculateNumber = new CalculateNumber();

    @Test
    public void testFibFor20Elements() {
        //when
        int result = calculateNumber.calculateElements(20);
        //then
        Assert.assertThat(result, CoreMatchers.is(14328));
    }
    @Test
    public void testFibFor0Elements() {
        //when
        int result = calculateNumber.calculateElements(0);
        //then
        Assert.assertThat(result, CoreMatchers.is(0));
    }
    @Test
    public void testFibForLessElements() {
        //when
        int result = calculateNumber.calculateElements(-1);
        //then
        Assert.assertThat(result, CoreMatchers.is(0));
    }
    @Test
    public void testFibFor1Element() {
        //when
        int result = calculateNumber.calculateElements(1);
        //then
        Assert.assertThat(result, CoreMatchers.is(2));
    }
    @Test
    public void testFibFor5Elements() {
        //when
        int result = calculateNumber.calculateElements(5);
        //then
        Assert.assertThat(result, CoreMatchers.is(10));
    }
    @Test
    public void testFibFor4MillionElements() {
        //when
        int result = calculateNumber.calculateElements(4000000);
        //then
        Assert.assertThat(result, CoreMatchers.is(1110529254));
    }
}