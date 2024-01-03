package iprwc.s1133075.webshop.Service;

import iprwc.s1133075.webshop.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    // Methods for managing products
}
