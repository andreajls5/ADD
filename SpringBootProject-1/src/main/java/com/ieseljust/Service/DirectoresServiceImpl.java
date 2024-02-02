package com.ieseljust.Service;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;

import com.ieseljust.springbootproject.dto.DirectoresDTO;
import com.ieseljust.springbootproject.model.Directores;
import com.ieseljust.springbootproject.repository.ActoresRepository;
import com.ieseljust.springbootproject.repository.DirectoresRepository;

public class DirectoresServiceImpl implements DirectorService{
	
	@Override
	public void saveDirectores(DirectoresDTO directoresDTO) {
		Directores directores = DirectoresDTO.convertToEntity(directoresDTO);
		Directores save = DirectoresRepository.save(directores);
		
	}

	@Override
	public DirectoresDTO getDirectoresById(Long id_Director) {
		Optional<Directores> director = ActoresRepository.findById(id_Director);
		if(director.isPresent()) {
			return DirectoresDTO.convertToDTO(director.get());
		}else {
			return null;
		}
	}

	@Override
	public List<DirectoresDTO> listAllDirectores() {
		List<Directores> lista = DirectoresRepository.findAll();
		List<DirectoresDTO> listaResultado = new ArrayList<DirectoresDTO>();
		for (int i = 0; i < lista.size(); ++i) {
			listaResultado.add(DirectoresDTO.convertToDTO(lista.get(i)));
		}
		return listaResultado;
	}

	@Override
	public void deleteDirectores(Long id_Director) {
		DirectoresRepository.deleteById(id_Director);
		
	}

	@Override
	public void saveActores(DirectoresDTO directoresDTO) {
		// TODO Auto-generated method stub
		
	}

}
