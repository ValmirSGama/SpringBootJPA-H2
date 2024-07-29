package projetoSpringBoot.SpringJPA_H2.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projetoSpringBoot.SpringJPA_H2.entities.User;
import projetoSpringBoot.SpringJPA_H2.repositories.UserRepository;

@Service // Registra como um componete do spring
public class UserService {

	@Autowired // Resolve a dependencia e associa o "repository" no "UserService" 
	private UserRepository repository;
	
	// EndPoint para buscar todos os usuários
	public List<User> findAll(){
		return repository.findAll();
	}
	
	// EndPoint para buscar o usuário por ID
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
}
