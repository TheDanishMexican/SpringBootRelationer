package kea.projects.springbootrelationer.repositories;

import kea.projects.springbootrelationer.models.OrderLine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderLineRepository extends JpaRepository<OrderLine, Integer> {
}
