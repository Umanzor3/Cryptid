package com.revature.cryptid.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.revature.cryptid.model.User;
import com.revature.cryptid.repository.UserRepository;

public class UserService {
	
private UserRepository userRepository;
	
	@Autowired
	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public List<User> findAllUsers() {
		return userRepository.findAll();
	}
	
	public void deleteUserById(int id) {
		userRepository.deleteById(id);
	}
	
	public User getUserById(int id) {
		Optional<User> c = userRepository.findById(id);
		if (c.isPresent()) {
			return c.get();
		} else {
			return null;
		}
	}
	
	public User findUserByName(String name) {
		return userRepository.findUserByUsername(name);
	}
	
	public void createUser(User user) {
		userRepository.save(user);
	}
	
	public int updateUser (User user) {
		User u = userRepository.save(user);
		if (u != null) {
			return u.getId();
		}else {
			return 0;
		}
	}

}



