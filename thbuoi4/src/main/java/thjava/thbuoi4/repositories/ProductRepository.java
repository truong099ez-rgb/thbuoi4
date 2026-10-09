package thjava.thbuoi4.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import thjava.thbuoi4.models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
