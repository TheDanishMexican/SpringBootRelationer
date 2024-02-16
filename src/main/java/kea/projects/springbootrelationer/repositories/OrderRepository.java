package kea.projects.springbootrelationer.repositories;

import kea.projects.springbootrelationer.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
