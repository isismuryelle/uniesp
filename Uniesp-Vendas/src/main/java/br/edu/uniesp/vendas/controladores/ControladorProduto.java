package br.edu.uniesp.vendas.controladores;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.edu.uniesp.vendas.entidades.Produto;
import br.edu.uniesp.vendas.repositorio.ProdutoRepositorio;

@Local
@Stateless
public class ControladorProduto {

	@PersistenceContext
	private EntityManager entityManager;

	private ProdutoRepositorio produtoRepositorio;

	@PostConstruct
	public void init() {
		produtoRepositorio = new ProdutoRepositorio(entityManager);
	}

	public Produto salvar(Produto produto) {
		return produtoRepositorio.salvar(produto);
	}

	public List<Produto> listar() {
		return produtoRepositorio.listar();
	}

	public void deletar(Produto produto) {
		produtoRepositorio.deletar(produto);
	}

}