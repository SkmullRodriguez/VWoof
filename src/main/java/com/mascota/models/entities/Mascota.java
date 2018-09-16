package com.mascota.models.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import oracle.sql.CLOB;

@SuppressWarnings("deprecation")
@Entity
@Table(name="MASCOTA")
public class Mascota {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "mascota_seq")
	@SequenceGenerator(name = "mascota_Seq", sequenceName = "MASCOTA_SEQ")
	private Long ID;
	
	@Column(name="NOMBRE")
	private String nombre;
	
	@Column(name="ID_DATOS")
	private int id_datos;
	
	@Column(name="FECHA_NACIMIENTO")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date fecha_nacimiento;
	
	@Column(name="FOTO")
	private CLOB foto;
	
	@Column(name="Color")
	private String color;
	
	@Column(name="RAZA")
	private String raza;
	
	@Column(name="Descripcion")
	private String descripcion;
	
	@Column(name="ESTADO")
	private String estado;
	
	@Column(name="NOMBRE")
	private int id_sexo;
	
	@Column(name="NOMBRE")
	private int id_tipo;
	
}
