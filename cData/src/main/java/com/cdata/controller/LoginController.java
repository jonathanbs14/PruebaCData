package com.cdata.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cdata.dao.User;

@RestController
public class LoginController {

	@Autowired
	com.example.demo.JWTAuthtenticationConfig jwtAuthtenticationConfig;

	@PostMapping("login")
	public User login(
			@RequestParam("user") String username,
			@RequestParam("encryptedPass") String encryptedPass) {

		/**
		 * En el ejemplo no se realiza la correcta validación del usuario
		 */

		String token = jwtAuthtenticationConfig.getJWTToken(username);
		return new User(username, encryptedPass,token);
		
	}

}