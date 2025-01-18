package ibd.project.prometheusspring.repository;

import ibd.project.prometheusspring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
