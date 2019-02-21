package xyz.oeste.integracion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
 
import xyz.oeste.integracion.dao.PokemonDAO;
 
import xyz.oeste.integracion.model.Pokemon;
 
@Service
public class PokemonService {
    @Autowired
    private PokemonDAO pokemonDAO;
   
    @Transactional
    public void insertar(Pokemon pokemon) {
        pokemonDAO.insertar(pokemon);
    }
    @Transactional
    public void actualizar(Pokemon pokemon) {
        pokemonDAO.actualizar(pokemon);
    }
    @Transactional
    public void eliminar(int id_pokemon) throws Exception {
        pokemonDAO.eliminar(id_pokemon);
    }
    @Transactional
    public Pokemon buscarPorId(int id_pokemon) {
        return pokemonDAO.buscarPorId(id_pokemon);
    }
 
}