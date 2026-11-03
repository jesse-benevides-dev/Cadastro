/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastro;

/**
 *
 * @author jesse
 */
public class Produto {

    private int id;
    private String nome;
    private String unidade;
    private double preco;
    private int quantidade;

    public Produto() {
    }

    // Métodos para consultar os atributos

    public int obterId() {
        return id;
    }

    public String obterNome() {
        return nome;
    }

    public String obterUnidade() {
        return unidade;
    }

    public double obterPreco() {
        return preco;
    }

    public int obterQuantidade() {
        return quantidade;
    }

    // Métodos para modificar os atributos

    public void alterarNome(String nome) {
        this.nome = nome;
    }

    public void alterarUnidade(String unidade) {
        this.unidade = unidade;
    }

    public void alterarPreco(double preco) {
        this.preco = preco;
    }

    public void alterarQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    // Definição automática do ID

    void definirId(int id) {
        this.id = id;
    }
}