package com.example.springcloudfeign.controller;

import java.util.List;

import com.example.springcloudfeign.dto.UserServiceResponse;
import com.example.springcloudfeign.service.IUserClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserClientController {

	@Autowired
	private IUserClient client;

	@GetMapping("/findAllUser")
	public List<UserServiceResponse> findAllUser() {

		return client.getUsers();

	}

}
