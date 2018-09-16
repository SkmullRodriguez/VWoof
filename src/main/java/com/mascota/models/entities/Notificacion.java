package com.mascota.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="NOTIFICACION")
public class Notificacion {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "notificacion_seq")
	@SequenceGenerator(name = "notificacion_Seq", sequenceName = "NOTIFICACION_SEQ")
	private Long ID;
	
	@Column(name="ID_DATOS")
	private String id_datos;
	
	@Column(name="NOTIFICACION")
	private String notifica;
}
