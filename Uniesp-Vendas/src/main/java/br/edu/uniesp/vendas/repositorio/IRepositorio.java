package br.edu.uniesp.vendas.repositorio;

import java.util.List;

import javax.persistence.EntityManager;

public abstract class IRepositorio<T> {

	private EntityManager entityManager;

	public IRepositorio(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	abstract T salvar(T t);

	abstract T buscarPorId(Long id);

	abstract List<T> listar();

	abstract void deletar(T t);

}