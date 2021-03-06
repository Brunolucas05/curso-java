package oo.composicao;

import java.util.ArrayList;

public class Compra {

    String cliente;
    ArrayList<Item> itens = new ArrayList<Item>();

    void adicionarItens(String nome, int quantidade, double preco){
        this.adicionrItem(new Item(nome, quantidade , preco));
    }

    void adicionrItem(Item item){
        this.itens.add(item);
        item.compra = this;
    }

    void adicionarItem(String nome, int quantidade, double preco){


    }

    double getValorTotal() {
        double total = 0;

        for (Item item : itens ){
            total += item.quantidade * item.preco;
        }
        return total;
    }
}
