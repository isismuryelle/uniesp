package br.edu.uniesp.vendas.beans;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.edu.uniesp.vendas.controladores.ControladorProduto;
import br.edu.uniesp.vendas.controladores.ControladorVenda;
import br.edu.uniesp.vendas.entidades.Produto;
import br.edu.uniesp.vendas.entidades.ProdutoVenda;
import br.edu.uniesp.vendas.entidades.Venda;

@Named
@ViewScoped
public class CadastrarVendaBean implements Serializable {

	private static final long serialVersionUID = 1113786406112202142L;

	@EJB
	private ControladorVenda controladorVenda;

	@EJB
	private ControladorProduto controladorProduto;

	private List<Produto> produtosHaVenda;

	private ProdutoVenda produtoVenda;

	private List<ProdutoVenda> produtosAdicionados;

	private Venda venda;

	@PostConstruct
	public void init() {
		setVenda(new Venda());
		setProdutoVenda(new ProdutoVenda());
		setProdutosHaVenda(controladorProduto.listar());
		setProdutosAdicionados(new ArrayList<ProdutoVenda>());
	}

	public void salvar() {
		getVenda().setDataVenda(LocalDateTime.now());
		getVenda().setProdutosVenda(getProdutosAdicionados());
		controladorVenda.salvar(getVenda());
		setVenda(new Venda());
		setProdutoVenda(new ProdutoVenda());
		setProdutosHaVenda(controladorProduto.listar());
		setProdutosAdicionados(new ArrayList<ProdutoVenda>());
	}

	public void adicionarProdutos() {
		getProdutosAdicionados().add(getProdutoVenda());
		setProdutoVenda(new ProdutoVenda());
	}

	public ProdutoVenda getProdutoVenda() {
		return produtoVenda;
	}

	public void setProdutoVenda(ProdutoVenda produtoVenda) {
		this.produtoVenda = produtoVenda;
	}

	public List<Produto> getProdutosHaVenda() {
		return produtosHaVenda;
	}

	public void setProdutosHaVenda(List<Produto> produtosHaVenda) {
		this.produtosHaVenda = produtosHaVenda;
	}

	public List<ProdutoVenda> getProdutosAdicionados() {
		return produtosAdicionados;
	}

	public void setProdutosAdicionados(List<ProdutoVenda> produtosAdicionados) {
		this.produtosAdicionados = produtosAdicionados;
	}

	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}

}