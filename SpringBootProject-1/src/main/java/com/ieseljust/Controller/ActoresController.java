package com.ieseljust.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ieseljust.springbootproject.dto.ActoresDTO;
import com.ieseljust.springbootproject.service.ActoresService;

@RestController
@RequestMapping("/id")
@RequiredArgsConstructor
public class ActoresController {
	
	private final ActoresService actoresService;
	
	   private final ActoresService ActoresService;

    ActoresController(ActoresService actoresService) {
        this.ActoresService = actoresService;
    }

    void ActoresController(ActoresService actoresService) {
        this.ActoresService = actoresService;
    }

	    @PostMapping
	    public void agregarActor(@RequestBody ActoresDTO actorDTO) {
	        ActoresService.saveActores(actorDTO);
	    }

	    @GetMapping
	    public List<ActoresDTO> listarActores() {
	        return ActoresService.listAllActores();
	    }

	    @GetMapping("/{id}")
	    public ActoresDTO obtenerActorPorId(@PathVariable Long id) {
	        return ActoresService.getActoresById(id);
	    }

	    @DeleteMapping("/{id}")
	    public void eliminarActor(@PathVariable Long id) {
	        ActoresService.deleteActores(id);
	    }
	    
	    @PostMapping(value = "login")
	    public ResponseEntity<ActoresResponse> login(@RequestBody LoginResquest request)
	    {
	    	return ResponseEntity.ok(authService.login(request));
	    }

}
