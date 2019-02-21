package xyz.oeste.integracion.dao;

import org.springframework.stereotype.Repository;

import xyz.oeste.integracion.model.Entrenador;

@Repository
public class EntrenadorDAO extends GenericDAO<Entrenador,Integer> {

	public EntrenadorDAO() {
		super(Entrenador.class);
		// TODO Auto-generated constructor stub
	}
	
}
