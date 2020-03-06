package springmvc_example.service;

import java.util.List;

import springmvc_example.model.Persona;

public interface PersonaService {
	public List<Persona> listPersonas();
	
	public void guardarOActualizar(Persona persona);
	
	public Persona encontrarPersonaPorId(int id);
	
	public void borrarPersona(int id);
}
