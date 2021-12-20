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

	private Long idProduto;

	@PostConstruct
	public void init() {
		produto = new Produto();
		if (getIdProduto() != null) {
			setProduto(controladorProduto.buscarPorId(getIdProduto()));
		}
	}

	public Produto salvar() {
		if (getIdProduto() != null) {
			produto.setId(getIdProduto());
		}
		return controladorProduto.salvar(produto);
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}

}