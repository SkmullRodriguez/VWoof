package com.mascota.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="VACUNA")
public class Vacuna {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "vacuna_seq")
	@SequenceGenerator(name = "vacuna_Seq", sequenceName = "VACUNA_SEQ")
	private Long ID;
	
	@Column(name="NOMBRE")
	private String nombre;
	
	@Column(name="DESCRIPCION")
	private String descripcion;

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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
