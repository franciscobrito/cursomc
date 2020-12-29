package com.facbrito.cursomc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.facbrito.cursomc.domain.Cliente;
import com.facbrito.cursomc.repository.ClienteRepository;
import com.facbrito.cursomc.service.exception.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public Cliente find(Integer id) {
		Optional<Cliente> cliente = clienteRepository.findById(id);
		return cliente.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontra! Id: " + id + ", Tipo: " + Cliente.class.getName()));
	}
	
}
