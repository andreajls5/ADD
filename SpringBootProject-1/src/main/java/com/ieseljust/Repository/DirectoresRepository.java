package com.ieseljust.Repository;

import java.util.List;


import org.apache.commons.logging.Log;
import org.apache.el.stream.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ieseljust.springbootproject.model.Directores;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface DirectoresRepository extends JpaRepository <Directores, Long>{
	Optional<Directores> findByUserName(String nombre;)
	
	void save();
	void findById();
	List<Directores> findAll();
	void deleteById();
	
	Boolean existsByNombre(String nombre);
	
	Boolean existsByEmail(String username);
}
