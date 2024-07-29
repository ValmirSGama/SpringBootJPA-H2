package projetoSpringBoot.SpringJPA_H2.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projetoSpringBoot.SpringJPA_H2.entities.Order;
import projetoSpringBoot.SpringJPA_H2.repositories.OrderRepository;

@Service // Registra como um componete do spring
public class OrderService {

	@Autowired // Resolve a dependencia e associa o "repository" no "OrderService"
	private OrderRepository repository;

	// EndPoint para buscar todos os usuários
	public List<Order> findAll() {
		return repository.findAll();
	}

	// EndPoint para buscar o usuário por ID
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
