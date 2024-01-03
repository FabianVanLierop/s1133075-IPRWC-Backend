package iprwc.s1133075.webshop.Model;


import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private double price;
    private int stockQuantity;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
