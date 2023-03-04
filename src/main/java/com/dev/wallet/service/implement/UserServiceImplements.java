package com.dev.wallet.service.implement;

import com.dev.wallet.model.User;
import com.dev.wallet.repositories.UserRepository;
import com.dev.wallet.service.exception.UserException;
import com.dev.wallet.services.UserService;

public class UserServiceImplements implements UserService{
	
	private UserRepository userRepository;

	public UserServiceImplements(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public User authenticateUser(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User registerUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User validateEmail(String email) {
		if(userRepository.existsByEmail(email)) {
			throw new UserException("email already registered!");
			return User.getEmail();
		}
	}

}
