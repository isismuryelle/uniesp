/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uniesp.vendas.entidades;

import java.util.List;

/**
 *
 * @author 55839
 */
public class Venda {
    private List<ProdutoVenda> produtosVenda;

    public List<ProdutoVenda> getProdutosVenda() {
        return produtosVenda;
    }

    public void setProdutosVenda(List<ProdutoVenda> produtosVenda) {
        this.produtosVenda = produtosVenda;
    }

}
