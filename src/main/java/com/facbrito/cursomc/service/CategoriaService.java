package com.facbrito.cursomc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.facbrito.cursomc.domain.Categoria;
import com.facbrito.cursomc.repository.CategoriaRepository;
import com.facbrito.cursomc.service.exception.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public Categoria find(Integer id) {
		Optional<Categoria> categoria = categoriaRepository.findById(id);
		return categoria.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontra! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}
	
}
