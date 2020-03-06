package springmvc_example.dao;

import java.util.List;

import springmvc_example.model.Persona;

public interface PersonaDao {
	public List<Persona> listPersonas();
	
	public void guardarOActualizar(Persona persona);
	
	public Persona encontrarPersonaPorId(int id);
	
	public void borrarPersona(int id);
	
	
}
