package com.dev.wallet.services;

import com.dev.wallet.model.User;

public interface UserService {
	User authenticateUser(String email, String password);
	User registerUser(User user);
	User validateEmail(String email);
}
