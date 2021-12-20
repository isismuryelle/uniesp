package br.edu.uniesp.vendas.repositorio;

import java.util.List;

import javax.persistence.EntityManager;

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
		getEntityManager().remove(t);
	}

}