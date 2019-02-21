package xyz.oeste.integracion.dao;

import org.springframework.stereotype.Repository;

import xyz.oeste.integracion.model.PokeTipo;
import xyz.oeste.integracion.model.PokeTipoId;

@Repository
public class  PokeTipoDAO   extends GenericDAO<PokeTipo,PokeTipoId> {
	
	public PokeTipoDAO() {
		super(PokeTipo.class);
		// TODO Auto-generated constructor stub
	}

}
