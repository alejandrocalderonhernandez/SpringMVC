package xyz.oeste.integracion.model;
// Generated 18/08/2018 11:03:45 AM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PokeTipoId generated by hbm2java
 */
@Embeddable
public class PokeTipoId implements java.io.Serializable {

	private int idPokemon;
	private int idTipo;

	public PokeTipoId() {
	}

	public PokeTipoId(int idPokemon, int idTipo) {
		this.idPokemon = idPokemon;
		this.idTipo = idTipo;
	}

	@Column(name = "id_pokemon", nullable = false)
	public int getIdPokemon() {
		return this.idPokemon;
	}

	public void setIdPokemon(int idPokemon) {
		this.idPokemon = idPokemon;
	}

	@Column(name = "id_tipo", nullable = false)
	public int getIdTipo() {
		return this.idTipo;
	}

	public void setIdTipo(int idTipo) {
		this.idTipo = idTipo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PokeTipoId))
			return false;
		PokeTipoId castOther = (PokeTipoId) other;

		return (this.getIdPokemon() == castOther.getIdPokemon()) && (this.getIdTipo() == castOther.getIdTipo());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdPokemon();
		result = 37 * result + this.getIdTipo();
		return result;
	}

}
