package se.newton.project.controller;

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

import se.newton.project.CrudRepositories.CartRepository;
import se.newton.project.CrudRepositories.UserRepository;
import se.newton.project.DBModels.Cart;
import se.newton.project.DBModels.User;

@Controller
@CrossOrigin
@RequestMapping(path = "/cart")
public class CartController {

	@Autowired
	private CartRepository cartRepo;

	@Autowired
	private UserRepository userRepo;

	@GetMapping(path = "/getCart")
	public ResponseEntity<Cart> getCard(@RequestParam int id) {
		try {
			Cart cart = cartRepo.findOne(id);

			return new ResponseEntity<Cart>(cart, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity(e, HttpStatus.BAD_REQUEST);
		}
	}

	@PostMapping(path = "/addCartToUser")
	public ResponseEntity<Cart> addCartToUser(@RequestBody Cart cart) {
		try {
			User user = userRepo.findOne(cart.getUserId());
			user.getOrderList().add(cart);

			userRepo.save(user);
			return new ResponseEntity<Cart>(cart, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity(e, HttpStatus.BAD_REQUEST);
		}
	}
}
