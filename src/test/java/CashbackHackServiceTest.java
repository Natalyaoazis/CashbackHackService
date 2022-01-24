import org.testng.annotations.Test;

import static org.testng.Assert.*;

 public class CashbackHackServiceTest {
     CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldRemain() {
        int expected = 300;
        int actual = service.remain(700);
        assertEquals(actual, expected);
    }

     @Test
     public void shouldCheckRemainIfAmountEqualsBondary() {
         int expected = 0;
         int actual = service.remain(1000);
         assertEquals(actual, expected);
     }

     @Test
     public void shouldRemainIfAmountIsOverBondary() {
         assertEquals(100,service.remain(1900));
     }
}