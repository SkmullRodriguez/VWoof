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
public class Citas {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "citas_seq")
	@SequenceGenerator(name = "citas_Seq", sequenceName = "CITAS_SEQ")
	private Long ID;
	
	@Column(name="ID_MASCOTA")
	private String id_mascota;
	
	@Column(name="ID_VETERINARIA")
	private String id_veterinaria;
	
	@Column(name="DESCRIPCION")
	private String descripcion;
	
	@Column(name="ID_VACUNA")
	private String id_vacuna;
	
	@Column(name="FECHA")
	private String fecha;
	
	@Column(name="RECETA")
	private String receta;
	
	@Column(name="DIAGNOSTICO")
	private String diagnostico;
	
	@Column(name="FRECUENCIA_CARDIACA")
	private String frecuencia_cardiaca;
	
	@Column(name="RESPIRACION")
	private String respiracion;
}
