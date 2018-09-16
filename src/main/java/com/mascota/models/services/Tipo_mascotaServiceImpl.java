package com.mascota.models.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mascotas.models.dao.ITipo_mascotaDao;

@Service
public class Tipo_mascotaServiceImpl implements ITipo_mascotaService {
	
	@Autowired
	private ITipo_mascotaDao tipo_mascotaDao;
}
