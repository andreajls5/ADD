package com.ieseljust.Service;

import java.util.List;

import com.ieseljust.springbootproject.dto.DirectoresDTO;

public interface DirectorService {
	
	void saveActores(DirectoresDTO directoresDTO);
	DirectoresDTO getDirectoresById(Long id_Director);
	List<DirectoresDTO> listAllDirectores();
	void deleteDirectores(Long id_Director);
	void saveDirectores(DirectoresDTO directoresDTO);
	

}