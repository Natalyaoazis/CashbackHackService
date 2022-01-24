import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

 public class CashbackHackServiceTest {
     CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldRemain() {
        int expected = 300;
        int actual = service.remain(700);
        assertEquals(expected, actual);
    }

     @Test
     public void shouldCheckRemainIfAmountEqualsBondary() {
         int expected = 0;
         int actual = service.remain(1000);
         assertEquals(expected, actual);
     }

     @Test
     public void shouldRemainIfAmountIsOverBondary() {
         assertEquals(100,service.remain(1900));
     }
}