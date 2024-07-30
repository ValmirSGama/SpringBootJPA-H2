package projetoSpringBoot.SpringJPA_H2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import projetoSpringBoot.SpringJPA_H2.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
