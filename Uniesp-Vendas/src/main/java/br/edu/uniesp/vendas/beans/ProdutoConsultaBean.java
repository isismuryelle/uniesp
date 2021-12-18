package br.edu.uniesp.vendas.beans;

import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.edu.uniesp.vendas.controladores.ControladorProduto;
import br.edu.uniesp.vendas.entidades.Produto;

@Named
@RequestScoped
public class ProdutoConsultaBean {

	@EJB
	private ControladorProduto controladorProduto;
	
	private Produto produto;
	
	
	
	public Produto salvar() {
		return controladorProduto.salvar(produto);
	}
	
	public List<Produto> listarProdutos(){
		return controladorProduto.listar();
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	
}
