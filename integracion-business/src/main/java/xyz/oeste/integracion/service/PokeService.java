package xyz.oeste.integracion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import xyz.oeste.integracion.dao.EntrenadorDAO;
import xyz.oeste.integracion.dao.PokemonDAO;
import xyz.oeste.integracion.dao.PokeDAO;
import xyz.oeste.integracion.model.Poke;
import xyz.oeste.integracion.model.Pokemon;

@Service
public class PokeService {
	
	@Autowired
	private PokeDAO pokeDAO;
	
	@Transactional
	public void insertar(Poke poke) {
		//Entrenador e=entrenadorDAO.buscarPorId(id_entrenador);
		//Pokemon p=pokemonDAO.buscarPorId(id_pokemon);
		pokeDAO.insertar(poke);
	}
	
	@Transactional
	public void actualizar(Poke poke) {
		pokeDAO.actualizar(poke);
	}

	
	@Transactional
	public Poke buscar(int id) {
		//Entrenador e=entrenadorDAO.buscarPorId(id_entrenador);
		//Pokemon p=pokemonDAO.buscarPorId(id_pokemon);
		return pokeDAO.buscarPorId(id);
	}

	
	@Transactional
	public void eliminar(int id) throws Exception {
		//Entrenador e=entrenadorDAO.buscarPorId(id_entrenador);
		//Pokemon p=pokemonDAO.buscarPorId(id_pokemon);
		pokeDAO.eliminar(id);
	}


}