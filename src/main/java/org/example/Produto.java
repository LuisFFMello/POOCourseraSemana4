package org.example;
public class Produto {

    private String nome;
    private int cod;
    private double preco;

    public Produto (String nome, int cod, double preco)
    {
        this.preco = preco;
        this.cod = cod;
        this.nome = nome;

    }

    @Override
    public int hashCode() {
        final int abc = 31;
        int r = 1;
        r = abc * r + cod;
        return r;
    }
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Produto))
            return false;
        Produto prodB = (Produto) obj;

        // compara os hashCode
        if (this.hashCode() == prodB.hashCode())
            return true;
        else
            return false;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCod() {
        return cod;
    }
    public void setCod(int cod) {
        this.cod = cod;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
}