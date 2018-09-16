package com.mascota.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.mascota.models.services.ITipo_usuarioService;

@Controller
@SessionAttributes("Tipo_usuario")
public class Tipo_usuarioController {
	
	@Autowired
	private ITipo_usuarioService tipo_usuarioService;
}
