package xyz.oeste.integracion.endpoints;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.stereotype.Service;

@WebService
@Service
public class HolaMundoEndPoint {
	@WebMethod
	public String saludar() {
		return"Hola mundo SOAP";
	}
	
}
