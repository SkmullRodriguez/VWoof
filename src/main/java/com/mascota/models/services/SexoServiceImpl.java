package com.mascota.models.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mascotas.models.dao.ISexoDao;

@Service
public class SexoServiceImpl implements ISexoService {

	@Autowired
	private ISexoDao sexoDao;
	
}
