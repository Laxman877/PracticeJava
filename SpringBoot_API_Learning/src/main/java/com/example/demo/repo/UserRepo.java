package com.example.demo.repo;

import org.springframework.data.repository.*;

import com.example.demo.model.User;

public interface UserRepo extends CrudRepository<User , Integer>{

}
