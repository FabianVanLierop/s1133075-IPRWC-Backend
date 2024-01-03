package iprwc.s1133075.webshop.Repository;

import iprwc.s1133075.webshop.Model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Category, Long> {
}
