import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TApp {
    @Test
    public void calculateStr() throws Exception {
        Calculate cal = new Calculate("(5 + 5)");
        assertEquals(10., cal.calculateStr(), 1E-40);
        cal = new Calculate("6*6");
        assertEquals(36., Math.abs(cal.calculateStr()), 1E-40);
        cal = new Calculate("16/1");
        assertEquals(16., Math.abs(cal.calculateStr()), 1E-40);
        cal = new Calculate("20 * 5");
        assertEquals(100., Math.abs(cal.calculateStr()), 1E-40);
    }

}
