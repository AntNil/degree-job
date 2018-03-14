package se.newton.project.CrudRepositories;

import org.springframework.data.repository.CrudRepository;

import se.newton.project.DBModels.Cart;

public interface CartRepository extends CrudRepository<Cart, Long> {

}
