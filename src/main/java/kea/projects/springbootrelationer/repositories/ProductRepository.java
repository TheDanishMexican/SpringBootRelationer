package kea.projects.springbootrelationer.repositories;

import kea.projects.springbootrelationer.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
