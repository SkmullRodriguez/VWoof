package com.mascota.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ACCESO")
public class Acceso {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "acceso_seq")
	@SequenceGenerator(name = "acceso_Seq", sequenceName = "ACCESO_SEQ")
	private Long ID;
	
	@Column(name="ID_DATOS")
	private String id_datos;
	
	@Column(name="USUARIO")
	private String usuario;
	
	@Column(name="CONTRASENA")
	private String contrasena;
}
