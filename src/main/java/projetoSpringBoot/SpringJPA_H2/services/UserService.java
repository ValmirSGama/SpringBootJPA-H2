package projetoSpringBoot.SpringJPA_H2.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projetoSpringBoot.SpringJPA_H2.entities.User;
import projetoSpringBoot.SpringJPA_H2.repositories.UserRepository;
import projetoSpringBoot.SpringJPA_H2.services.exceptions.ResourceNotFoundException;

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
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	// EndPoint para inserir um usuário no banco de dados
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	// EndPoint para deletar um usuário no banco de dados
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	// EndPoint para atualizar um usuário no banco de dados
	public User update(Long id, User obj) {
		User entity = repository.getReferenceById(id);
		updateData(entity, obj);
		return repository.save(entity);
	}

	// Efetivação da atualização dos dados
	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
}
