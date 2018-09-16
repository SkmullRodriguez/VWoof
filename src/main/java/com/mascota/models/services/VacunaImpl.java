package com.mascota.models.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mascotas.models.dao.IVacunaDao;

@Service
public class VacunaImpl implements IVacunaService {

	@Autowired
	private IVacunaDao vacunaDao;
}
