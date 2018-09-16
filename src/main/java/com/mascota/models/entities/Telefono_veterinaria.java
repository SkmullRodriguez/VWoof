package com.mascota.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TELEFONO_VETERINARIA")
public class Telefono_veterinaria {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "telefono_vete_seq")
	@SequenceGenerator(name = "telefono_vete_Seq", sequenceName = "TELEFONO_VETE_SEQ")
	private Long ID;
	
	@Column(name="ID_VETERINARIA")
	private String id_veterinaria;
	
	@Column(name="NUMERO")
	private String numero;
}
