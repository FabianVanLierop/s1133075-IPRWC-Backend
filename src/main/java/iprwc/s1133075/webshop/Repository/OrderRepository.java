package iprwc.s1133075.webshop.Repository;

import iprwc.s1133075.webshop.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
