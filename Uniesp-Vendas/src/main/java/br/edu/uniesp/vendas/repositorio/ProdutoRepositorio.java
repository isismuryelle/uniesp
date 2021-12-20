package br.edu.uniesp.vendas.repositorio;

import java.util.List;

import javax.persistence.EntityManager;

import br.edu.uniesp.vendas.entidades.Produto;

public class ProdutoRepositorio extends IRepositorio<Produto> {

	public ProdutoRepositorio(EntityManager entityManager) {
		super(entityManager);
	}

	@Override
	public Produto salvar(Produto produto) {
		return getEntityManager().merge(produto);
	}

	@Override
	public List<Produto> listar() {
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT produto ");
		sql.append("FROM Produto produto");
		return getEntityManager().createQuery(sql.toString(), Produto.class).getResultList();
	}

	@Override
	public void deletar(Produto t) {
		getEntityManager().remove(t);
	}

}