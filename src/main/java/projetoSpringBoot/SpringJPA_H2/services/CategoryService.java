package projetoSpringBoot.SpringJPA_H2.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projetoSpringBoot.SpringJPA_H2.entities.Category;
import projetoSpringBoot.SpringJPA_H2.repositories.CategoryRepository;

@Service // Registra como um componete do spring
public class CategoryService {

	@Autowired // Resolve a dependencia e associa o "repository" no "CategoryService" 
	private CategoryRepository repository;
	
	// EndPoint para buscar todos os usuários
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	// EndPoint para buscar o usuário por ID
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
}
