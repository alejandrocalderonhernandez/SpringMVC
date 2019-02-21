package xyz.oeste.integracion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import xyz.oeste.integracion.dao.RegionDAO;
import xyz.oeste.integracion.model.Region;

@Service
public class RegionService {
	@Autowired
	private RegionDAO regionDAO;
	
	@Transactional
	public void insertar(Region region) {
		regionDAO.insertar(region);
	}
	@Transactional
	public void actualizar(Region region) {
		regionDAO.actualizar(region);
	}
	@Transactional
	public void eliminar(int id_region) throws Exception {
		regionDAO.eliminar(id_region);
	}
	@Transactional
	public Region buscarPorId(int id_region) {
		return regionDAO.buscarPorId(id_region);
	}
	
	@Transactional
	public List<Region> buscarTodos() {
		return regionDAO.buscarTodos();
	}

}