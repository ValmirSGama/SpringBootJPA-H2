package projetoSpringBoot.SpringJPA_H2.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import projetoSpringBoot.SpringJPA_H2.entities.Product;
import projetoSpringBoot.SpringJPA_H2.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

	@Autowired // Resolve a dependencia e associa o "service" no "ProductService" 
	private ProductService service; 
	
	// Implementação do endpoint para acessar todos os usuários
	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
		List<Product> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	// Implementação do endpoint para acessar o usuário por ID
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id){
		Product obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}