package se.newton.project.CrudRepositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import se.newton.project.DBModels.Cart;

public interface CartRepository extends CrudRepository<Cart, Integer> {

	@Query("Select c from Cart c where c.id=:id")
	Cart findOne(@Param("id") int id);
}
