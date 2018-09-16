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
public class Telefono_datos {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "telefono_datos_seq")
	@SequenceGenerator(name = "telefono_datos_Seq", sequenceName = "TELEFONO_DATOS_SEQ")
	private Long ID;
	
	@Column(name="ID_DATOS")
	private String id_datos;
	
	@Column(name="NUMERO")
	private String numero;
}
