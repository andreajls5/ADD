package com.ieseljust.Model;

import java.util.List;

import org.apache.commons.logging.Log;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Data
@Entity
@Table(name = "actores",
	uniqueConstraints = {
			@UniqueConstraint(columnNames = "nombre"),
			@UniqueConstraint(columnNames = "username")
	}
public class Actores {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	@Column(name = "id_Actor")
	private Long id_Actor;
	
	@NotBlank
	@Size(max = 20)
	@Column(name = "nombre")
	private String Nombre;
	
	@Column(name = "películas")
	private int Peliculas;
	
	@NotBlank
	@Size(max = 50)
	@Column(name = "username")
	private String Username;
	
	@NotBlank
	@Size(max = 120)
	private String password;
    
    public Actores() {
    }

    public Actores(Long id_Actor, String nombre, String email, String password {
		super();
		this.id_Actor = id_Actor;
		Nombre = nombre;
		Username = Username;
		this.password = password;
	}

	public Long getId_actor() {
        return id_Actor;
    }

    public void setId_actor(Long id_actor) {
        this.id_Actor = id_actor;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public void setPeliculas(int peliculas) {
        this.Peliculas = peliculas;
    }

	public String getUsername() {
		return Username;
	}

	public void setEmail(String Username) {
		Username = Username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
    
}