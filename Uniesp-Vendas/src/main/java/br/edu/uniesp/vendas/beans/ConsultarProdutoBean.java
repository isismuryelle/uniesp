package br.edu.uniesp.vendas.beans;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.edu.uniesp.vendas.controladores.ControladorProduto;
import br.edu.uniesp.vendas.entidades.Produto;

@Named
@RequestScoped
public class ConsultarProdutoBean implements Serializable {

	private static final long serialVersionUID = 8756337125949903414L;

	@EJB
	private ControladorProduto controladorProduto;

	public List<Produto> listarProdutos() {
		return controladorProduto.listar();
	}

}