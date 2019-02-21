package xyz.oeste.integracion.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "entrenador")
public class Entrenador {
	int id_entrenador;
	String nombre;
	Integer medallas;
	Integer edad;
	String contrasenia;
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="entrenador_generador")
	//@SequenceGenerator(name="entrenador_generador", sequenceName="nombre_secuencia_baseDatos")
	@Column(name = "id_entrenador")
	public int getId_entrenador() {
		return id_entrenador;
	}
	public void setId_entrenador(int id_entrenador) {
		this.id_entrenador = id_entrenador;
	}
	
	@Column(name = "nombre")
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Column(name = "medallas")
	public Integer getMedallas() {
		return medallas;
	}
	public void setMedallas(Integer medallas) {
		this.medallas = medallas;
	}
	
	@Column(name = "edad")
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	@Column(name = "contrasenia")
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	
}
