package xyz.oeste.integracion.dao;

import org.springframework.stereotype.Repository;

import xyz.oeste.integracion.model.Pokemon;

@Repository
public class PokemonDAO  extends GenericDAO<Pokemon,Integer> {
	
	public PokemonDAO() {
		super(Pokemon.class);
		// TODO Auto-generated constructor stub
	}

}

