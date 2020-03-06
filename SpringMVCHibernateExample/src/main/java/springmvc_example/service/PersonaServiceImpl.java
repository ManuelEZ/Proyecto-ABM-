package springmvc_example.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc_example.dao.PersonaDao;
import springmvc_example.model.Persona;


@Service
@Transactional
public class PersonaServiceImpl implements PersonaService{
	
	PersonaDao personaDao;
	
	@Autowired
	public void setPersonaDao(PersonaDao personaDao) {
		this.personaDao = personaDao;
	}

	public List<Persona> listPersonas() {		
		return personaDao.listPersonas();
	}

	public void guardarOActualizar(Persona persona) {
		personaDao.guardarOActualizar(persona);	
	}

	public Persona encontrarPersonaPorId(int id) {
		return personaDao.encontrarPersonaPorId(id);
	}

	public void borrarPersona(int id) {
		personaDao.borrarPersona(id);
	}

}
