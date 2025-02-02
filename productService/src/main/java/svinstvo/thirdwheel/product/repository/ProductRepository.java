package svinstvo.thirdwheel.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import svinstvo.thirdwheel.product.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    public Product findByName(String name);
}
