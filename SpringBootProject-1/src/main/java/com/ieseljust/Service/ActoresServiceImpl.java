package com.ieseljust.Service;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ieseljust.springbootproject.dto.ActoresDTO;
import com.ieseljust.springbootproject.model.Actores;
import com.ieseljust.springbootproject.repository.ActoresRepository;

@Service
public class ActoresServiceImpl implements ActoresService{
	
	@Autowired
	private ActoresRepository actoresRepository;
	
	@Override
	public void saveActores(ActoresDTO actorDTO) {
		Actores actor = ActoresDTO.convertToEntity(actorDTO);
		actoresRepository.save(actor);
		
	}
	
	@Override
	public ActoresDTO getActoresById(Log id_Actor) {
		Optional<Actores> actor = ActoresRepository.findAllById(id_Actor);
		if(actor.isPresent()) {
			return ActoresDTO.convertToDTO(actor.get());
		}else {
			return null;
		}
	}
	
	@Override
	public List<ActoresDTO> listAllActores() {
		List<Actores> lista = actoresRepository.findAll();
		List<ActoresDTO> listaResultado = new ArrayList<ActoresDTO>();
		for (int i = 0; i < lista.size(); ++i) {
			listaResultado.add(ActoresDTO.convertToDTO(lista.get(i)));
		}
		return listaResultado;
	}
	
	@Override
	public void deleteActors(Long id_Actor) {
		actoresRepository.deleteById(id_Actor);
	}

	@Override
	public ActoresDTO getActoresById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteActores(Long id) {
		// TODO Auto-generated method stub
		
	}
	

}
