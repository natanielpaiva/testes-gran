package org.example;

import java.util.ArrayList;
import java.util.List;
// Me siga @natanieltech
public class CarrinhoDeCompras {
    private List<Item> itens = new ArrayList<>();

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public double calcularValorTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.getPrecoTotal();
        }
        return total;
    }

    // Método para obter a lista de itens, para fins de teste
    public List<Item> getItens() {
        return itens;
    }
}
