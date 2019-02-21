package xyz.oeste.integracion.dao;

import org.springframework.stereotype.Repository;

import xyz.oeste.integracion.model.Tipo;

@Repository
public class  TipoDAO   extends GenericDAO<Tipo,Integer> {
	
	public TipoDAO() {
		super(Tipo.class);
		// TODO Auto-generated constructor stub
	}

}