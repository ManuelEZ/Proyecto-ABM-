package springmvc_example.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import springmvc_example.model.Persona;

@Repository
public class PersonaDaoImpl implements PersonaDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@SuppressWarnings("unchecked")
	public List<Persona> listPersonas() {
		Criteria criteria = getSession().createCriteria(Persona.class);
		return (List<Persona>) criteria.list();
	}

	public void guardarOActualizar(Persona persona) {
		getSession().saveOrUpdate(persona);		
	}

	public Persona encontrarPersonaPorId(int id) {
		Persona persona = (Persona) getSession().get(Persona.class, id);
		return persona;
	}

	public void borrarPersona(int id) {
		Persona persona = (Persona) getSession().get(Persona.class, id);
		getSession().delete(persona);
	}

}
