package br.edu.uniesp.vendas.beans;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.edu.uniesp.vendas.controladores.ControladorProduto;
import br.edu.uniesp.vendas.entidades.Produto;

@Named
@RequestScoped
public class CadastrarProdutoBean implements Serializable {

	private static final long serialVersionUID = 4560103839463160428L;

	@EJB
	private ControladorProduto controladorProduto;

	private Produto produto;

	@PostConstruct
	public void init() {
		produto = new Produto();
	}

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