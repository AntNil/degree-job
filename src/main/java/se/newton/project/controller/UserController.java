package se.newton.project.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import se.newton.project.CrudRepositories.UserRepository;
import se.newton.project.DBModels.User;

@Controller
@CrossOrigin
@RequestMapping(path="/user")
public class UserController {
	
	@Autowired
	private UserRepository userRepo;
	
	@GetMapping(path="/getUser")
	public ResponseEntity<User> getUser(@RequestParam int id) {
		User user = userRepo.findOne(id);
		
		if(user != null) {
			
		return new ResponseEntity(user, HttpStatus.FOUND);
		}
		else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping(path="/createUser")
	public ResponseEntity createUser(@RequestBody User user) {
		try {
			
		userRepo.save(user);
		return new ResponseEntity(HttpStatus.CREATED);
		}
		catch (Exception e) {
			return new ResponseEntity(e ,HttpStatus.BAD_REQUEST);
		}
	}
}
