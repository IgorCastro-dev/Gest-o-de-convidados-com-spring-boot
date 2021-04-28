package com.igorcastro.gestaofesta.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.igorcastro.gestaofesta.model.Convidado;
import com.igorcastro.gestaofesta.repository.Convidados;



@Controller
public class ConvidadosController {
	
	@Autowired
	private Convidados convidados;
	
	@RequestMapping(value="/convidados", method=RequestMethod.GET)
	public ModelAndView listar(Convidado mensagem) {
		ModelAndView modelAndView = new ModelAndView("convidadosview");
		modelAndView.addObject("convidados", convidados.findAll());
		return modelAndView;
		}

	@RequestMapping(value="/convidados", method=RequestMethod.POST)
	public String salvar(Convidado convidado) {
		this.convidados.save(convidado);
		return "redirect:/convidados";
	}
	
}
