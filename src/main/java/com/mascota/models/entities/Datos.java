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
public class Datos {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "datos_seq")
	@SequenceGenerator(name = "datos_Seq", sequenceName = "DATOS_SEQ")
	private Long ID;
	
	@Column(name="NOMBRE")
	private String nombre;
	
	@Column(name="SEG_NOMBRE")
	private String seg_nombre;
	
	@Column(name="APELLIDO")
	private String apellido;
	
	@Column(name="SEG_APELLIDO")
	private String seg_apellido;
	
	@Column(name="DIRECCION")
	private String direccion;
	
	@Column(name="ESTADO")
	private String estado;
	
	@Column(name="ID_TIPO_USUARIO")
	private String id_tipo_usuario;
}
