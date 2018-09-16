package com.mascota.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="DATOS")
public class Veterinaria {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "dveterinaria_seq")
	@SequenceGenerator(name = "veterinaria_Seq", sequenceName = "VETERINARIA_SEQ")
	private Long ID;
	
	@Column(name="NOMBRE")
	private String nombre;
	
	@Column(name="DIRECCION")
	private String direccion;
	
	@Column(name="ID_DATOS")
	private String id_datos;
}
