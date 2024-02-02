package com.ieseljust.Model;

import java.util.List;

import org.apache.commons.logging.Log;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

import org.apache.commons.logging.Log;

@Data
@Entity
@Table(name = "directores",
	uniqueConstraints = {
		@UniqueConstraint(columnNames = "nombre"),
		@UniqueConstraint(columnNames = "username")
}
public class Directores {
	
	@Id
	@GeneratedValue( strategy=GenerationType.IDENTITY)

	@Column(name = "id_Director")
	private Long id_Director;
	
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
    
    public Directores() {
    }

    public Directores(Long id_Director, String nombre, String username, String password {
		super();
		this.id_Director = id_Director;
		Nombre = nombre;
		Username = Username;
		this.password = password;
	}

	public Long getId_director() {
        return id_Director;
    }

    public void setId_director(Long id_director) {
        this.id_Director = id_director;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public int getPeliculas() {
        return Peliculas;
    }

    public void setPeliculas(int peliculas) {
        this.Peliculas = peliculas;
    }

	public String getUsername() {
		return Username;
	}

	public void setEmail(String username) {
		Username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
    

}
