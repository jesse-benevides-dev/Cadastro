/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastro;

import java.util.ArrayList;

/**
 *
 * @author jesse
 */
public class ControleProduto {
    private ArrayList<Produto> produtos;
    private int proximoId;

    public ControleProduto() {
        produtos = new ArrayList<>();
        proximoId = 1;
    }

    public void incluir(Produto produto) {
        produto.definirId(proximoId);
        produtos.add(produto);
        proximoId++;
    }

    public void alterar(Produto produto) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).obterId() == produto.obterId()) {
                produtos.set(i, produto);
                return;
            }
        }
    }

    public void excluir(Produto produto) {
        produtos.remove(produto);
    }
    
    public ArrayList<Produto> selecionarProdutos() {
        return produtos;
    }
}
