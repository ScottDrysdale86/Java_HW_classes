import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle bottle;

    @Before
    public void Before(){
        bottle = new WaterBottle(100);
    }

    @Test
    public void hasVolume(){
        assertEquals(100,bottle.getVolume());
    }

    @Test
    public void drinks(){
        assertEquals(90, bottle.drink());
    }

    @Test
    public void empties(){
        bottle.empty();
        assertEquals(0, bottle.getVolume());
    }

    @Test
    public void filled(){
        bottle.fill();
        assertEquals(100, bottle.getVolume());
    }
}
