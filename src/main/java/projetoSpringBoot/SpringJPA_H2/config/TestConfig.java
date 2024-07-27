package projetoSpringBoot.SpringJPA_H2.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import projetoSpringBoot.SpringJPA_H2.entities.User;
import projetoSpringBoot.SpringJPA_H2.repositories.UserRepository;

@Configuration
@Profile("test") // classe de configuração específica de perfil de teste
public class TestConfig implements CommandLineRunner {

	@Autowired // Resolve a dependencia e associa o "userRepository" no "TestConfig"  
	 private UserRepository userRepository; // Objeto que acessa os dados

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2));	
	}
}
