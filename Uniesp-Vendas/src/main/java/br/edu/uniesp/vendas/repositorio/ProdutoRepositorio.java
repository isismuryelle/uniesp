package br.edu.uniesp.vendas.repositorio;

import java.util.List;

import javax.persistence.EntityManager;

import br.edu.uniesp.vendas.entidades.Produto;

public class ProdutoRepositorio extends IRepositorio<Produto> {

	public ProdutoRepositorio(EntityManager entityManager) {
		super(entityManager);
	}

	@Override
	public Produto salva(Produto produto) {		
		return getEntityManager().merge(produto);
	}

	@Override
	public List<Produto> listar() {
		
		StringBuilder sql = new StringBuilder();
		sql.append("Select p ");
		sql.append("from Produto p");
		return getEntityManager().createQuery(sql.toString()).getResultList();
	}

	
	
		
}
