package br.edu.uniesp.vendas.repositorio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.edu.uniesp.vendas.entidades.Venda;

public class VendaRepositorio extends IRepositorio<Venda> {

	public VendaRepositorio(EntityManager entityManager) {
		super(entityManager);
	}

	@Override
	public Venda salvar(Venda venda) {
		return getEntityManager().merge(venda);
	}

	@Override
	public List<Venda> listar() {
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT venda ");
		sql.append("FROM Venda venda");
		return getEntityManager().createQuery(sql.toString(), Venda.class).getResultList();
	}

	@Override
	public void deletar(Venda t) {
		Venda venda = buscarPorId(t.getId());
		getEntityManager().remove(venda);
	}

	@Override
	public Venda buscarPorId(Long idVenda) {
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT venda ");
		sql.append("FROM Venda venda ");
		sql.append("WHERE venda.id = :idVenda ");
		TypedQuery<Venda> query = getEntityManager().createQuery(sql.toString(), Venda.class);
		query.setParameter("idVenda", idVenda);
		return query.getSingleResult();
	}

}