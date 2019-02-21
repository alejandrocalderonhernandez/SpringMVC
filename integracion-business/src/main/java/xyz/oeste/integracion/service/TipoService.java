package xyz.oeste.integracion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import xyz.oeste.integracion.dao.TipoDAO;
import xyz.oeste.integracion.model.Tipo;

@Service
public class TipoService {
	@Autowired
	private TipoDAO tipoDAO;
	
	
	@Transactional
	public void insertar(Tipo tipo) {
		tipoDAO.insertar(tipo);
	}
	@Transactional
	public void actualizar(Tipo tipo) {
		tipoDAO.actualizar(tipo);
	}
	@Transactional
	public void eliminar(int id_tipo) throws Exception {
		tipoDAO.eliminar(id_tipo);
	}
	@Transactional
	public Tipo buscarPorId(int id_tipo) {
		return tipoDAO.buscarPorId(id_tipo);
	}

}