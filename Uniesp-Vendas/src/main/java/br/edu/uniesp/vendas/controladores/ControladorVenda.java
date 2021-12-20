package br.edu.uniesp.vendas.controladores;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.edu.uniesp.vendas.entidades.Venda;
import br.edu.uniesp.vendas.repositorio.VendaRepositorio;

@Local
@Stateless
public class ControladorVenda {

	@PersistenceContext
	private EntityManager entityManager;

	private VendaRepositorio vendaRepositorio;

	@PostConstruct
	public void init() {
		vendaRepositorio = new VendaRepositorio(entityManager);
	}

	public Venda salvar(Venda venda) {
		return vendaRepositorio.salvar(venda);
	}

	public List<Venda> listar() {
		return vendaRepositorio.listar();
	}

	public void deletar(Venda venda) {
		vendaRepositorio.deletar(venda);
	}

}