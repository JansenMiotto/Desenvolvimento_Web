package br.edu.infnet.appaluguelcarros.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

//@Entity
//@Table(name="TVeiculo")
//@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Veiculo {
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name="id")
	private Long id;
//	@Column(name="nome_carro")
	private String nomeCarro;
//	@Column(name="cor")
	private String cor;
//	@Column(name="qtde_dias")
	private int qtdeDias;
//	@Column(name="disponivel")
	private boolean disponivel;
//	@Column(name="valor")
	private float valor;
	
	
	public Veiculo(String nomeCarro, String cor, int qtdeDias, boolean disponivel, float valor) {
		this.nomeCarro = nomeCarro;
		this.cor = cor;
		this.qtdeDias = qtdeDias;
		this.disponivel = disponivel;
		this.valor = valor;
	}
	
	public abstract float valorAluguel();
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(nomeCarro);
		sb.append(";");
		sb.append(cor);
		sb.append(";");
		sb.append(qtdeDias);
		sb.append(";");
		sb.append(disponivel ? "Disponível" : "Indisponível");
		sb.append(";");
		sb.append(valor);
		return sb.toString();
	}

	public String getNomeCarro() {
		return nomeCarro;
	}

	public String getCor() {
		return cor;
	}

	public int getQtdeDias() {
		return qtdeDias;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public float getValor() {
		return valor;
	}

	public Long getId() {
		return id;
	}	
	
}
