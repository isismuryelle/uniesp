/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uniesp.vendas.beans;

import br.edu.uniesp.vendas.entidades.Produto;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author 55839
 */
@Named
@SessionScoped
public class CadastroItem implements Serializable{
   
    private Produto item;    
    private List<Produto> produtos;
    
    @PostConstruct
    public void build(){
        item = new Produto();
        produtos = new ArrayList<>();
    }

    public Produto getItem() {
        return item;
    }

    public void setItem(Produto item) {
        this.item = item;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
    
    
}
