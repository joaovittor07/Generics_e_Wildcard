package Exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	
    private List<ProdutoX> produtos;

    public Pedido() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(ProdutoX produto) {
        produtos.add(produto);
    }

    public void mostrarProdutos() {
        for (ProdutoX produto : produtos) {
            System.out.println("ID: " + produto.getId() + ", Nome: " + produto.getNome());
        }
    }
}
