package com.mascota.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TIPO_USUARIO")
public class Tipo_usuario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "tipo_usu_seq")
	@SequenceGenerator(name = "tipo_usu_Seq", sequenceName = "TIPO_USU_SEQ")
	private Long ID;
	
	@Column(name="NOMBRE")
	private String nombre;

	//Getter y setter
	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
