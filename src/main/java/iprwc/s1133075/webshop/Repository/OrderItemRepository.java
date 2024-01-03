package iprwc.s1133075.webshop.Repository;

import iprwc.s1133075.webshop.Model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
