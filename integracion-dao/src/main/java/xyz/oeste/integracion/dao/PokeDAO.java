package xyz.oeste.integracion.dao;

import org.springframework.stereotype.Repository;

import xyz.oeste.integracion.model.Poke;

@Repository
public class PokeDAO  extends GenericDAO<Poke,Integer> {
	
	public PokeDAO() {
		super(Poke.class);
		// TODO Auto-generated constructor stub
	}

}
