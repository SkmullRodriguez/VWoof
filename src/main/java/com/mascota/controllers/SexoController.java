package com.mascota.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.mascota.models.services.ISexoService;

@Controller
@SessionAttributes("Sexo")
public class SexoController {
	
	@Autowired
	private ISexoService sexoService;
}
