package com.ieseljust.Service;

import java.util.List;

import org.apache.commons.logging.Log;

import com.ieseljust.springbootproject.dto.ActoresDTO;

public interface ActoresService {
	
	void saveActores(ActoresDTO actoresDTO);
	ActoresDTO getActoresById(Long id);
	List<ActoresDTO> listAllActores();
	void deleteActores(Long id);
	ActoresDTO getActoresById(Log id_Actor);
	void deleteActors(Long id_Actor);
	

}
