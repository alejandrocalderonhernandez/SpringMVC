package xyz.oeste.integracionweb;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import xyz.oeste.integracion.endpoints.Exception_Exception;
import xyz.oeste.integracion.endpoints.Region;
import xyz.oeste.integracion.endpoints.RegionEndPoint;
import xyz.oeste.integracion.endpoints.RegionEndPointService;

@Controller//Anotacioon que indica que esta clase es un controlador

public class ControllerWebIntegracion {
	@RequestMapping(value="/consultar", method=RequestMethod.GET)//Anotacion que indica como va  a ser accedido el metodo
	public String buscarRegion(Model modelo) {
		  RegionEndPoint servicio = new RegionEndPointService().getRegionEndPointPort();
		  modelo.addAttribute("listaRegiones",servicio.buscarTodos());
		  return "index";
		}
	
	@RequestMapping(value="/agregar", method=RequestMethod.POST)
	public String insertar(Region region, Model model) {
			RegionEndPoint servicio = new RegionEndPointService().getRegionEndPointPort();
			//servicio.insertar(region.getIdRegion(), region.getNombre());
			servicio.insertar(region);
			return "index";
	}
	
	@RequestMapping(value="/actializa", method=RequestMethod.POST)
	 public String  actualizar(Region region) {
		Boolean bandera = true;
		List<Region> busqueda = new ArrayList<Region>() ;
		RegionEndPoint servicio = new RegionEndPointService().getRegionEndPointPort();
		busqueda = servicio.buscarTodos();
		for(Region r:busqueda) {
			if(r.equals(region)) {
				bandera = false;
			}
		}
		if(bandera == true) {
			servicio.actualizar(region);
		}
		return "index";
	}
	
	@RequestMapping(value="/elimina", method=RequestMethod.POST)
	 public String  eliminar(Integer id) throws Exception_Exception {
		Boolean bandera = true;
		List<Region> busqueda = new ArrayList<Region>();
		RegionEndPoint servicio = new RegionEndPointService().getRegionEndPointPort();
		busqueda = servicio.buscarTodos();
		for(Region r:busqueda) {
			if(r.getIdRegion() == id) {
				bandera = false;
			}
		}
		if(bandera == true) {
			servicio.servicioEliminar(id);
		}
		return "index";
	}
	
	
}
