import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;
    @Before
    public void before(){
        printer = new Printer(20, 50);
    }

    @Test
    public void hasPages(){
        assertEquals(20, printer.getPagesLeft());
    }

    @Test
    public void canPrint(){
        printer.print(10,1);
        assertEquals(10, printer.getPagesLeft());
    }
    @Test
    public void wontPrintIfNotEnoughPages(){
        assertEquals("not enough pages", printer.print(15,2));
    }
    @Test
    public void canReduceToner(){
        printer.print(10,2);
        assertEquals(30, printer.getTonerVolume());
    }

}
