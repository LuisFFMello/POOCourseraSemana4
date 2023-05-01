package org.example;

public class ProdutoComTamanho extends Produto {

    private int tamanho;
    public ProdutoComTamanho(int cod ,String nome, double preco, int tamanho) {
        super(nome, cod, preco);
        this.tamanho = tamanho;
    }
    @Override
    public int hashCode() {
        final int abc = 31;
        int r = super.hashCode();
        r = abc * r  + tamanho;
        return r;
    }
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ProdutoComTamanho))
            return false;
        ProdutoComTamanho prodB = (ProdutoComTamanho) obj;

        // compara os hashCode
        if (this.hashCode() == prodB.hashCode())
            return true;
        else return false;
    }
}