package projetoSpringBoot.SpringJPA_H2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import projetoSpringBoot.SpringJPA_H2.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
