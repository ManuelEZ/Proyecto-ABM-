package springmvc_example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import springmvc_example.model.Persona;
import springmvc_example.service.PersonaService;

@Controller
@RequestMapping(value="/persona")
public class PersonaController {

	@Autowired
	PersonaService personaService;
	
	@RequestMapping(value="/list", method = RequestMethod.GET)
	public ModelAndView list() {
		ModelAndView model = new ModelAndView("persona/list");
		List<Persona> list = personaService.listPersonas();		
		model.addObject("list", list);
		
		return model;
	}
	
	@RequestMapping(value="/update/{id}", method = RequestMethod.GET)
	public ModelAndView update(@PathVariable("id") int id) {
		ModelAndView model = new ModelAndView("persona/form");
		Persona persona = personaService.encontrarPersonaPorId(id);
		model.addObject("personaForm", persona);
		
		return model;
	}
	
	@RequestMapping(value="/delete/{id}", method = RequestMethod.GET)
	public ModelAndView delete(@PathVariable("id") int id) {
		personaService.borrarPersona(id);
		
		return new ModelAndView("redirect:/persona/list");
	}
	
	@RequestMapping(value="/add", method = RequestMethod.GET)
	public ModelAndView update() {
		ModelAndView model = new ModelAndView("persona/form");
		Persona persona = new Persona();
		model.addObject("personaForm", persona);
		
		return model;
	}
	
	@RequestMapping(value="/save", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("personaForm") Persona persona) {
		personaService.guardarOActualizar(persona);
		
		return new ModelAndView("redirect:/persona/list");
	}
}

