package iprwc.s1133075.webshop.Service;

import iprwc.s1133075.webshop.Repository.OrderItemRepository;
import iprwc.s1133075.webshop.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    // Methods for managing orders and order items
}
