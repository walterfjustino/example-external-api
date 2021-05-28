package com.example.springcloudfeign.service;

import java.util.List;

import com.example.springcloudfeign.dto.UserServiceResponse;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(url = "https://jsonplaceholder.typicode.com", name = "IUSER-CLIENT")
public interface IUserClient {

    @GetMapping("/users")
    public List<UserServiceResponse> getUsers();

}