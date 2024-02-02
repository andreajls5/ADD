package com.ieseljust.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ieseljust.springbootproject.dto.DirectoresDTO;
import com.ieseljust.springbootproject.service.DirectorService;

import java.util.List;

@RestController
@RequestMapping("/api/directores")
public class DirectoresController {

    private final DirectorService directorService;

    @PostMapping
    public void agregarDirector(@RequestBody DirectoresDTO directorDTO) {
    	directorService.saveDirectores(directorDTO);
    }

    @GetMapping
    public List<DirectoresDTO> listarDirectores() {
        return directorService.listAllDirectores();
    }

    @GetMapping("/{id}")
    public DirectoresDTO obtenerDirectorPorId(@PathVariable Long id) {
        return directorService.getDirectoresById(id);
    }

    @DeleteMapping("/{id}")
    public void eliminarDirector(@PathVariable Long id) {
        directorService.deleteDirectores(id);
    }
}