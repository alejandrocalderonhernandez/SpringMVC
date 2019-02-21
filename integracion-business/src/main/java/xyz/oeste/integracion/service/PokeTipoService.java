package xyz.oeste.integracion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import xyz.oeste.integracion.dao.PokeTipoDAO;
import xyz.oeste.integracion.model.PokeTipo;
import xyz.oeste.integracion.model.PokeTipoId;

@Service
public class PokeTipoService {
	@Autowired
	private PokeTipoDAO pokeTipoDAO;
	
	
	@Transactional
	public void insertar(PokeTipo poke_tipo) {
		pokeTipoDAO.insertar(poke_tipo);
	}
	@Transactional
	public void actualizar(PokeTipo poke_tipo) {
		pokeTipoDAO.actualizar(poke_tipo);
	}
	@Transactional
	public void eliminar(PokeTipoId id) throws Exception {
		pokeTipoDAO.eliminar(id);
	}
	@Transactional
	public PokeTipo buscarPorId(PokeTipoId id) {
		return pokeTipoDAO.buscarPorId(id);
	}

}
