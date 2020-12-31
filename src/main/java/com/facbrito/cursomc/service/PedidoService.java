package com.facbrito.cursomc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.facbrito.cursomc.domain.Pedido;
import com.facbrito.cursomc.repository.PedidoRepository;
import com.facbrito.cursomc.service.exception.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository pedidoRepository;

	public Pedido find(Integer id) {
		Optional<Pedido> pedido = pedidoRepository.findById(id);
		return pedido.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontra! Id: " + id + ", Tipo: " + Pedido.class.getName()));
	}

}
