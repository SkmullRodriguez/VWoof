package com.mascota.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="SEXO")
public class Sexo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "sexo_seq")
	@SequenceGenerator(name = "sexo_Seq", sequenceName = "SEXO_SEQ")
	private Long ID;
	
	@Column(name="SEXO")
	private String sexo;

	//Getter y setter
	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

}
