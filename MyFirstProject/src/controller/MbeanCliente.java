package controller;

import javax.annotation.ManagedBean;
//import javax.faces.bean.ManagedBean;

@SuppressWarnings("deprecation")
@ManagedBean(value="mbeanCliente")
public class MbeanCliente {
	
	private String nome;
	private Double preco;
	private Double quantidade;
	private String descricao;
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



	
	public void salvar() {
		System.out.println(nome);
		System.out.println(preco);
		System.out.println(quantidade);
		System.out.println(descricao);
		System.out.println("Pericl„„„„„„oooooo!!!");
	}
}
