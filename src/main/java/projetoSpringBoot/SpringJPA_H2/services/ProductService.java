package projetoSpringBoot.SpringJPA_H2.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projetoSpringBoot.SpringJPA_H2.entities.Product;
import projetoSpringBoot.SpringJPA_H2.repositories.ProductRepository;

@Service // Registra como um componete do spring
public class ProductService {

	@Autowired // Resolve a dependencia e associa o "repository" no "ProductService" 
	private ProductRepository repository;
	
	// EndPoint para buscar todos os usuários
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	// EndPoint para buscar o usuário por ID
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}
