/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uniesp.vendas.beans;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.edu.uniesp.vendas.controladores.ControladorProduto;
import br.edu.uniesp.vendas.entidades.Produto;

/**
 *
 * @author 55839
 */
@Named
@RequestScoped
public class CadastroProduto implements Serializable{
   
	@EJB
	private ControladorProduto controladorProduto;
	
	private Produto produto;
	
	
	
	public Produto salvar() {
		return controladorProduto.salvar(produto);
	}
	

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
    
    
}
