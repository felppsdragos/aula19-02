package br.com.fiap.jpa.entity;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@javax.persistence.Entity
@Table(name = "TB_CLIENTE")
@SequenceGenerator(name = "cliente", sequenceName = "SQ_TB_CLIENTE", allocationSize = 1)

public class Cliente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "CD_CLIENTE")
	@GeneratedValue(generator = "cliente", strategy = GenerationType.SEQUENCE)
	private int id;

	@Column(name = "NM_NOME", nullable= false, length = 150)
	private String nome;

	@Column(name = "DT_NASCIMENTO", nullable = false)
	@Temporal(TemporalType.DATE)
	private Calendar dtNascimento;

	@Column(name = "CD_CODIGO")
	private Integer cod;

	@Column(name = "TP_SEXO", nullable = false)
	private Sexo sexo;

	@Lob
	@Column(name = "FL_FOTO")
	private byte[] foto;

	@Column(name = "DS_STATUS", nullable = false)
	private Status status;

	public Cliente( String nome, Calendar dtNascimento, Integer cod, Sexo sexo, byte[] foto, Status status) {
		super();
		
		this.nome = nome;
		this.dtNascimento = dtNascimento;
		this.cod = cod;
		this.sexo = sexo;
		this.foto = foto;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDtAniversario() {
		return dtNascimento;
	}

	public void setDtAniversario(Calendar dtAniversario) {
		this.dtNascimento = dtAniversario;
	}

	public Integer getCod() {
		return cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

}
