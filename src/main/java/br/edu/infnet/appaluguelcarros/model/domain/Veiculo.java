package br.edu.infnet.appaluguelcarros.model.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TVeiculo")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Veiculo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nomeCarro;
	private String cor;
	private int qtdeDias;
	private boolean disponivel;
	private float valor;

	@ManyToOne
	@JoinColumn(name="idUsuario")
	private Usuario usuario;
	
	@ManyToMany(mappedBy = "veiculos")
	private List<Locacao> locacao;
	
	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	public Veiculo() {
	
	}
	
	
	public Veiculo(String nomeCarro, String cor, int qtdeDias, boolean disponivel, float valor) {
		this();
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


	
	
	public List<Locacao> getLocacao() {
		return locacao;
	}


	public void setLocacao(List<Locacao> locacao) {
		this.locacao = locacao;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNomeCarro() {
		return nomeCarro;
	}


	public void setNomeCarro(String nomeCarro) {
		this.nomeCarro = nomeCarro;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public int getQtdeDias() {
		return qtdeDias;
	}


	public void setQtdeDias(int qtdeDias) {
		this.qtdeDias = qtdeDias;
	}


	public boolean isDisponivel() {
		return disponivel;
	}


	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}


	public float getValor() {
		return valor;
	}


	public void setValor(float valor) {
		this.valor = valor;
	}

	


}
