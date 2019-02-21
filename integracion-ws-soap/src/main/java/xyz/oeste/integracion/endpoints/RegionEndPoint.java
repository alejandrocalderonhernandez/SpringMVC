package xyz.oeste.integracion.endpoints;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.oeste.integracion.model.Region;
import xyz.oeste.integracion.service.RegionService;


@WebService// Indica que es un servicio web
@Service
public class RegionEndPoint {
	
	@Autowired
	private RegionService regionService;
	
	@WebMethod
	public Region  servicio(int id_region) {
		return regionService.buscarPorId(id_region);
	}
	
	@WebMethod
	public void  servicioEliminar(int   id_region) throws Exception {
		 regionService.eliminar(id_region);
	}
	
	@WebMethod
	public  void  insertar (Region region) {
		regionService.insertar(region);
	}
	
	@WebMethod
	public  void  actualizar(Region region) {
		regionService.actualizar(region);
	}
	
	@WebMethod
	public  List<Region>  buscarTodos() {
		return regionService.buscarTodos();
	}
	
	
}
