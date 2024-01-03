package iprwc.s1133075.webshop.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String password;
    private String address;

    @OneToMany(mappedBy = "orders")
    private List<Order> PurchaseOrders;
}
