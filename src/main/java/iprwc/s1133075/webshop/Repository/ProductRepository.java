package iprwc.s1133075.webshop.Repository;

import iprwc.s1133075.webshop.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
