package xyz.oeste.springbootrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import xyz.oeste.integracion.model.Region;
import xyz.oeste.integracion.service.RegionService;

@RestController
@RequestMapping("/region")
public class RegionController {
	
	@Autowired
	 RegionService regionService;
	
	@RequestMapping(value="/insertar", method=RequestMethod.GET)
	public String insertarRegion(Region region){
		 regionService.insertar(region);
		 return "done";
	}

}
