package com.samyuktatech.eshop.re;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rs/login")
public class LoginService {

	@PostMapping
	public ResponseEntity<?> login(
			@RequestParam("username") String username, 
			@RequestParam("password") String password) {
		
		// If any inputs are invalid then return bad response
		if (username == null || password == null || username.isEmpty() || password.isEmpty()) {
			return ResponseEntity.badRequest().body("Invalid inputs");
		}		
		
		return ResponseEntity.ok().build();
	}
}
