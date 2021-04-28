package com.igorcastro.gestaofesta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.igorcastro.gestaofesta.repository.Convidados;

@Controller
public class ConvidadosController {
	
	@Autowired
	private Convidados convidados;
	
	@RequestMapping("/convidados")
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("convidadosview");
		modelAndView.addObject("convidados", convidados.findAll());
		return modelAndView;
		}

	
}
