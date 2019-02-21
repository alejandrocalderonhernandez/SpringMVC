package xyz.oeste.integracion.dao;

import java.io.Serializable;
import java.util.List;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

//Clase generica que permite hacer operaciones para distitas clases recibe un  objeto clase y una llave PK 
public abstract class GenericDAO<E, PK extends Serializable> {
	
	@Autowired // Inyeccion de dependencias
	
	private SessionFactory sessionFactory; //Clase de Hibernate que crea una sesion
	
	private Class<E> clasePersistente; //Clase con la que estoy trabajando del model
	
	public GenericDAO(Class<E> tipo) {
		clasePersistente = tipo;
	}
	
	public void insertar(E entidad) {
		sessionFactory.getCurrentSession().save(entidad); //persist JPA
	}
	
	public void actualizar(E entidad) {
		sessionFactory.getCurrentSession().update(entidad); //merge JPA
	}
	
	public E buscarPorId(PK id) {
		return (E) sessionFactory.getCurrentSession().get(clasePersistente, id);
	}
	
	public void eliminar(PK id) throws Exception {
		E entidad=buscarPorId(id);
		if(entidad != null) {
			sessionFactory.getCurrentSession().delete(entidad);
		}else {
			throw new Exception("No se encuentra ese id en "+clasePersistente);
		}
	}
	
	public List<E>buscarTodos() {
		Query query = sessionFactory.getCurrentSession().createQuery("FROM " + clasePersistente.getName());
		return (List<E>) query.list();
		
	}
}
