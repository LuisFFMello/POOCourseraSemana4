import static org.junit.Assert.*;
import org.junit.Test;
import org.example.CarrinhoDeCompras;
import org.example.Produto;

public class TestCarrinhoDeCompras {

    @Test
    public void testeQuantidadeNoCarrinho()
    {
        Produto p = new Produto("Jaqueta", 875, 145);
        CarrinhoDeCompras c = new CarrinhoDeCompras();
        c.addProd(p, 2);
        assertEquals(CarrinhoDeCompras.getQtChart(), 2);
    }
}