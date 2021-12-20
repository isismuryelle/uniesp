package br.edu.uniesp.vendas.beans;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.edu.uniesp.vendas.controladores.ControladorVenda;
import br.edu.uniesp.vendas.entidades.Venda;

@Named
@RequestScoped
public class ConsultarVendaBean implements Serializable {

	private static final long serialVersionUID = 8217315856458959828L;

	@EJB
	private ControladorVenda controladorVenda;

	public List<Venda> listarVendas() {
		return controladorVenda.listar();
	}

	public void deletarVenda(Venda venda) {
		controladorVenda.deletar(venda);
	}

}