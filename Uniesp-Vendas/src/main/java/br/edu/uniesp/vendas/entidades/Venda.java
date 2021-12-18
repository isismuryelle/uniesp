/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uniesp.vendas.entidades;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author 55839
 */
@Entity
@Table(name = "TB_VENDA")
@SequenceGenerator(name = "SEQ_VENDA", sequenceName = "SEQ_VENDA", allocationSize = 1)
public class Venda {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_VENDA")
	@Column(name = "ID_VENDA")
	private Long id;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "ID_PRODUTO_VENDA")
	private List<ProdutoVenda> produtosVenda;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<ProdutoVenda> getProdutosVenda() {
		return produtosVenda;
	}

	public void setProdutosVenda(List<ProdutoVenda> produtosVenda) {
		this.produtosVenda = produtosVenda;
	}

}
