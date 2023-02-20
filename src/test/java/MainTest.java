import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void shop() {
        int[] prices = {30, 25, 60, 200, 120,60,100,90};
        int amount = 2;
        int productNumber = 1;
        assertEquals(50 , Main.totalPrice(prices,amount,productNumber));
    }
}