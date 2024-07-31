package projetoSpringBoot.SpringJPA_H2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import projetoSpringBoot.SpringJPA_H2.entities.OrderItem;
import projetoSpringBoot.SpringJPA_H2.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
