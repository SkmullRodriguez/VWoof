package com.mascota.models.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mascotas.models.dao.ITipo_usuarioDao;

@Service
public class Tipo_usuarioImpl implements ITipo_usuarioService {

	@Autowired
	private ITipo_usuarioDao tipo_usuarioDao;
}
