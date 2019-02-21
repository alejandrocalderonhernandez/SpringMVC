package xyz.oeste.integracion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.oeste.integracion.dao.EntrenadorDAO;
import xyz.oeste.integracion.model.Entrenador;


@Service //Anotacion que deriva de @Component refiere a la capa de servicio
public class EntrenadorService {
	
		@Autowired //Inyeccion de dependencias -> instancia un objeto
		private EntrenadorDAO entrenadorDAO;
		
		@Transactional // Define que todos los elementos dentro del metodo se van a manejar con una transaccion COMMIT, ROLLBACK y BEGIN
		public void insertar(Entrenador entrenador) {
			entrenadorDAO.insertar(entrenador);
		}

	  @Transactional
	    public void actualizar(Entrenador entrenador) {
	        entrenadorDAO.actualizar(entrenador);
	    }
	    @Transactional
	    public void eliminar(int entrenador) throws Exception {
	    	entrenadorDAO.eliminar(entrenador);
	    }
	
	    @Transactional
	    public Entrenador buscarPorId(int id_entrenador) {
	        return entrenadorDAO.buscarPorId(id_entrenador);
	    }
}
