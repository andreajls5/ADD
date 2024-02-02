package com.ieseljust.DTO;

import java.util.Set;

import com.ieseljust.springbootproject.model.Directores;

public class DirectoresDTO {

	private Long id_director;
    private String nombre;
    private String username;
    private String password;

    
    
    public DirectoresDTO() {
		super();
	}

    public DirectoresDTO(Long id_director, String nombre, String username, String password) {
		super();
		this.id_director = id_director;
		this.nombre = nombre;
		this.username = username;
		this.password = password;
	}


    public Long getId_director() {
		return id_director;
	}

	public void setId_director(Long id_director) {
		this.id_director = id_director;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}

public static DirectoresDTO convertToDTO(Directores director){
	
	DirectoresDTO directorDTO = new DirectoresDTO();
	directorDTO.setId_director(director.getId_director());
	directorDTO.setNombre(director.getNombre());
	
	return directorDTO;
}

public static Directores convertToEntity(DirectoresDTO directoresDTO) {
	
	Directores director = new Directores();
    director.setId_director(directoresDTO.getId_director());
    director.setNombre(directoresDTO.getNombre());
	
	return director;
}