package se.newton.project.CrudRepositories;

import org.springframework.data.repository.CrudRepository;

import se.newton.project.DBModels.Grocery;

public interface GroceryRepository extends CrudRepository<Grocery, Long> {

}
