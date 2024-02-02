package com.ieseljust.Repository;

import java.util.List;



import org.apache.commons.logging.Log;
import org.apache.el.stream.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ieseljust.springbootproject.model.Actores;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface ActoresRepository extends JpaRepository<Actores, Long>{
	Optional<Actores> findByUserName(Actores id_actores);
	
	void save();
	void findById();
	List<Actores> findAll();
	void deleteById();
	
	Boolean existsByNombre(String nombre);
	
	Boolean existsByEmail(String username);
}
