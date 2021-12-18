/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.uniesp.vendas.controladores;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.edu.uniesp.vendas.entidades.Produto;
import br.edu.uniesp.vendas.repositorio.ProdutoRepositorio;

/**
 *
 * @author 55839
 */
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
		return produtoRepositorio.salva(produto);
	}
	
	public List<Produto> listar(){
		return produtoRepositorio.listar();
	}
}
