package xyz.oeste.integracion.dao;

import org.springframework.stereotype.Repository;

import xyz.oeste.integracion.model.Region;

@Repository
public class RegionDAO extends GenericDAO<Region, Integer>{

	public RegionDAO() {
		super(Region.class);
	}

}