import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestFunction {

    @Test
    public void test01() {
        pp.currentWaterMeter = 100;
        pp.lastWaterMeter = 50;
        pp.currentElectMeter = 50;
        pp.lastElectMeter = 20;

        int result = pp.calculateResultBill("S");
        assertEquals(1930, result);
    }

    @Test
    public void test02() {
        pp.currentWaterMeter = 120;
        pp.lastWaterMeter = 60;
        pp.currentElectMeter = 70;
        pp.lastElectMeter = 40;

        int result = pp.calculateResultBill("S");
        assertEquals(1980, result);
    }

    @Test
    public void test03() {
        pp.currentWaterMeter = 50;
        pp.lastWaterMeter = 50;
        pp.currentElectMeter = 20;
        pp.lastElectMeter = 20;

        int result = pp.calculateResultBill("S");
        assertEquals(1500, result); 
    }

    @Test
    public void test04() {
        pp.currentWaterMeter = 120;
        pp.lastWaterMeter = 60;
        pp.currentElectMeter = 70;
        pp.lastElectMeter = 40;

        int result = pp.calculateResultBill("D");
        assertEquals(2480, result);
    }
}

