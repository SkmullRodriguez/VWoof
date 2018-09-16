package com.mascota.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TIPO_MASCOTA")
public class Tipo_mascota {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "tipo_masc_seq")
	@SequenceGenerator(name = "tipo_mas_Seq", sequenceName = "TIPO_MASC__SEQ")
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
