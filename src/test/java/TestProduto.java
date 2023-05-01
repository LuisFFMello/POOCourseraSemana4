import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TestProduto {

    @Test
    public void testEquals() {
        Produto p = new Produto("Meia", 45, 3);
        Produto p1 = new Produto("Ceroulas", 2, 10);
        assertEquals(p.equals(p1), p1.equals(p));
    }
    @Test
    public void testHashCode()
    {
        Produto p = new Produto("Meia", 45, 3);
        Produto p1 = new Produto("Ceroulas", 45, 10);
        assertEquals(p.hashCode(), p1.hashCode());

    }


}