import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TestProdutoComTamanho {
    @Test
    public void testEquals() {

        Produto pt = new ProdutoComTamanho(7, "Chinelo", 10, 45);
        Produto pt1 = new ProdutoComTamanho(7, "Pijama", 35, 48);
        assertEquals(pt.equals(pt1), pt1.equals(pt));
    }
    @Test
    public void testHashCode()
    {
        Produto pt = new ProdutoComTamanho(9, "Bracelete", 12, 23);
        Produto pt1 = new ProdutoComTamanho(9, "Tornozeleira", 8, 23);
        assertEquals(pt.hashCode(), pt1.hashCode());
    }
}