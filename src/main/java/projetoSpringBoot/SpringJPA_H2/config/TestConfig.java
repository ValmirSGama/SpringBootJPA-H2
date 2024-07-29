package projetoSpringBoot.SpringJPA_H2.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import projetoSpringBoot.SpringJPA_H2.entities.Order;
import projetoSpringBoot.SpringJPA_H2.entities.User;
import projetoSpringBoot.SpringJPA_H2.entities.enums.OrderStatus;
import projetoSpringBoot.SpringJPA_H2.repositories.OrderRepository;
import projetoSpringBoot.SpringJPA_H2.repositories.UserRepository;

@Configuration
@Profile("test") // classe de configuração específica de perfil de teste
public class TestConfig implements CommandLineRunner {

	@Autowired // Resolve a dependencia e associa o "userRepository" no "TestConfig"  
	 private UserRepository userRepository; // Objeto que acessa os dados
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		Order o1 = new Order(null, Instant.parse("2024-07-29T19:53:07Z"), OrderStatus.PAID, u1); 
		Order o2 = new Order(null, Instant.parse("2022-07-21T03:42:10Z"), OrderStatus.WATTING_PAYMENT, u2); 
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WATTING_PAYMENT, u1); 

		
		userRepository.saveAll(Arrays.asList(u1, u2));	
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
	}
}
