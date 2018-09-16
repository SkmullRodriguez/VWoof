package com.mascotas.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.mascota.models.entities.Vacuna;

public interface IVacunaDao extends CrudRepository<Vacuna, Long> {
	//Query
	
}
