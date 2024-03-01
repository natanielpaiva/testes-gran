import org.example.CarrinhoDeCompras;
import org.example.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
// Me siga @natanieltech
class CarrinhoDeComprasTest {

    private CarrinhoDeCompras carrinho;

    @BeforeEach
    void setUp() {
        carrinho = new CarrinhoDeCompras();
    }

    @Test
    void adicionarUmItem() {
        Item item = new Item("Café", 5.0, 2);
        carrinho.adicionarItem(item);
        assertEquals(1, carrinho.getItens().size(), "O carrinho deve conter 1 item.");
    }

    @Test
    void calcularValorTotal() {
        carrinho.adicionarItem(new Item("Café", 5.0, 2));
        carrinho.adicionarItem(new Item("Chá", 3.0, 1));
        assertEquals(13.0, carrinho.calcularValorTotal(), "O valor total deve ser 13.0");
    }
}
