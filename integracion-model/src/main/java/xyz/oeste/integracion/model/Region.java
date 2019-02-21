package xyz.oeste.integracion.model;
// Generated 18/08/2018 11:03:45 AM by Hibernate Tools 4.3.5.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlTransient;

/**
 * Region generated by hbm2java
 */

@Entity// Indica que esta clase es una entidad
@Table(name = "region", schema = "public") //ponen las propiedades de la tabla de la base de datos
public class Region implements java.io.Serializable {

	private int idRegion;
	private String nombre;
	@XmlTransient
	private Set<Pokemon> pokemons = new HashSet<Pokemon>(0);

	public Region() {
	}

	public Region(int idRegion) {
		this.idRegion = idRegion;
	}

	public Region(int idRegion, String nombre, Set<Pokemon> pokemons) {
		this.idRegion = idRegion;
		this.nombre = nombre;
		this.pokemons = pokemons;
	}

	@Id

	@Column(name = "id_region", unique = true, nullable = false)
	public int getIdRegion() {
		return this.idRegion;
	}

	public void setIdRegion(int idRegion) {
		this.idRegion = idRegion;
	}

	@Column(name = "nombre")
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "region")
	public Set<Pokemon> getPokemons() {
		return this.pokemons;
	}

	public void setPokemons(Set<Pokemon> pokemons) {
		this.pokemons = pokemons;
	}

}
