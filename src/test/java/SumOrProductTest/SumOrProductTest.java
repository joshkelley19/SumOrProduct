package SumOrProductTest;

import SumOrProduct.SumOrProduct;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by joshuakelley on 9/9/16.
 */
public class SumOrProductTest {
    @Test
    public void SumOrProductTest(){
        SumOrProduct test = new SumOrProduct();
        Assert.assertEquals(15, test.sum(5));
    }
}
