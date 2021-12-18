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
	
	
	abstract T salva(T t);
	abstract List<T> listar();
	
}
