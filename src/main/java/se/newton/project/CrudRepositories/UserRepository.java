package se.newton.project.CrudRepositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import se.newton.project.DBModels.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	
	@Query("Select u from User u where u.id=:id")
	User findOne(@Param("id") int id);
}
