import org.junit.Test;
import skobka.Sko;

public class bracketsPlacementTest {
    @Test
    public void roundBracketsTest() {
        String s = "NASA (National Aeronautics and Space Administration) launched its first Mars probe (Viking I) back in 1976. " +
                "(In this sentence, the parentheses is explaining what NASA stands for " +
                "and giving additional information about the Mars probe.)";
        Sko str = new Sko();
        assert str.Skob(s);
    }
}
