package br.edu.infnet.appaluguelcarros.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import br.edu.infnet.appaluguelcarros.exception.QtdeCondutoresException;

//@Entity
//@Table(name="TEconomico")
//@PrimaryKeyJoinColumn(name="id")
public class Economico extends Veiculo{
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name="idEconomico")
	private Integer idEconomico;
//	@Column(name="automatico")
	private boolean automatico;
//	@Column(name="qtde_condutores")
	private int qtdeCondutores;
//	@Column(name="ar_condicionado")
	private boolean arCondicionado;
	
	public Economico(String nomeCarro, String cor, int qtdeDias, boolean disponivel, float valor) {
		super(nomeCarro, cor, qtdeDias, disponivel, valor);
	}

	@Override
	public float valorAluguel() {
		return qtdeCondutores > 1 || arCondicionado != false? getValor()*getQtdeDias()+100 : getValor()*getQtdeDias();
		//return qtdeCondutores > 1? getValor()*getQtdeDias()+100 : getValor()*getQtdeDias();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(automatico ? "Automatico" : "Manual");
		sb.append(";");
		sb.append(qtdeCondutores);
		sb.append(";");
		sb.append(arCondicionado ? "Com Ar" : "Sem Ar");
		sb.append(";");
		sb.append(valorAluguel());
		return sb.toString();
		
	}
	
	public boolean isAutomatico() {
		return automatico;
	}

	public void setAutomatico(boolean automatico) {
		this.automatico = automatico;
	}

	public int getQtdeCondutores() {
		return qtdeCondutores;
	}

	public void setQtdeCondutores(int qtdeCondutores) throws QtdeCondutoresException {
		if(qtdeCondutores < 0 || qtdeCondutores > 3) {
			throw new QtdeCondutoresException("Quantidade de Condutores Inválida.");
		}
		this.qtdeCondutores = qtdeCondutores;
	}

	public boolean isArCondicionado() {
		return arCondicionado;
	}

	public void setArCondicionado(boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}

	public Integer getIdEconomico() {
		return idEconomico;
	}

	public void setIdEconomico(Integer idEconomico) {
		this.idEconomico = idEconomico;
	}
	
	

}
