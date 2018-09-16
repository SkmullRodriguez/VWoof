package com.mascota.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.mascota.models.services.ITipo_mascotaService;

@Controller
@SessionAttributes("Tipo_mascota")
public class Tipo_mascotaController {

	@Autowired
	private ITipo_mascotaService tipo_mascotaService;
}
