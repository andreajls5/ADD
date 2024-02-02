package com.ieseljust.DTO;

import java.util.Set;

import com.ieseljust.springbootproject.model.Actores;

public class ActoresDTO {

    private Long id_actor;
    private String nombre;
    private String username;
    private String password;
    
    public ActoresDTO() {
		super();
	}

	public ActoresDTO(Long id_actor, String nombre, String username, String password) {
		super();
		this.id_actor = id_actor;
		this.nombre = nombre;
		this.username = username;
		this.password = password;
	}


	public Long getId_actor() {
		return id_actor;
	}


	public void setId_actor(Long id_actor) {
		this.id_actor = id_actor;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


}

//Convierte una entidad DAO a un objeto DTO
public static ActoresDTO convertToDTO (Actores actor){
	
	//Creamos el cliente DTO y asignamos los valores basicos
	ActoresDTO actorDTO = new ActoresDTO();
	actorDTO.setId_actor(actor.getId_actor());
	actorDTO.setNombre(actor.getNombre());
	
	return actorDTO;

}

public static Actores convertToEntity(ActoresDTO actoresdto) {
	Actores actor = new Actores();
    actor.setId_actor(actoresdto.getId_actor());
    actor.setNombre(actoresdto.getNombre());
	
	return actor;
	
}