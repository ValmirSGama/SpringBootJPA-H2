package projetoSpringBoot.SpringJPA_H2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import projetoSpringBoot.SpringJPA_H2.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
