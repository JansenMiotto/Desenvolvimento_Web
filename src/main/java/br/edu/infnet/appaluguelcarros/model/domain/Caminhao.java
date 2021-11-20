package br.edu.infnet.appaluguelcarros.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.edu.infnet.appaluguelcarros.exception.QtdeEixoException;


//@Entity
//@Table(name="TCaminhao")
public class Caminhao extends Veiculo {

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name="idCaminhao")
	private Integer idCaminhao;
//	@Column(name="tipo_carroceria")
	private String tipoCarroceria;
//	@Column(name="cambio_automatico")
	private boolean cambioAutomatico;
//	@Column(name="qtde_eixo")
	private int qtdeEixo;

	public Caminhao(String nomeCarro, String cor, int qtdeDias, boolean disponivel, float valor) {
		super(nomeCarro, cor, qtdeDias, disponivel, valor);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(cambioAutomatico ? "Automatico" : "Manual");
		sb.append(";");
		sb.append(tipoCarroceria);
		sb.append(";");
		sb.append(qtdeEixo);
		sb.append(";");
		sb.append(valorAluguel());
		return sb.toString();
	}


	
	@Override
	public float valorAluguel() {
		return cambioAutomatico != false? getValor()*getQtdeDias()+100*(qtdeEixo * 0.2f) : getValor()*getQtdeDias()*(qtdeEixo * 0.2f);
	}

	public String getTipoCarroceria() {
		return tipoCarroceria;
	}

	public void setTipoCarroceria(String tipoCarroceria) {
		this.tipoCarroceria = tipoCarroceria;
	}

	public boolean isCambioAutomatico() {
		return cambioAutomatico;
	}

	public void setCambioAutomatico(boolean cambioAutomatico) {
		this.cambioAutomatico = cambioAutomatico;
	}

	public int getQtdeEixo() {
		return qtdeEixo;
	}

	public void setQtdeEixo(int qtdeEixo) throws QtdeEixoException {
		if(qtdeEixo < 5 || qtdeEixo > 9) {
			throw new QtdeEixoException("Quantidade de Eixo inválida");
		}
		this.qtdeEixo = qtdeEixo;
	}

	public Integer getIdCaminhao() {
		return idCaminhao;
	}

	public void setIdCaminhao(Integer idCaminhao) {
		this.idCaminhao = idCaminhao;
	}
	
	
	

}
