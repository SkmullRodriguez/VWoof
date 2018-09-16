package com.mascota.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.mascota.models.services.IVacunaService;

@Controller
@SessionAttributes("Vacuna")
public class VacunaController {

	@Autowired
	private IVacunaService vacunaService;
}
