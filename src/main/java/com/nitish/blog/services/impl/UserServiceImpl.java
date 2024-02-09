package com.nitish.blog.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.nitish.blog.entities.User;
import com.nitish.blog.payloads.UserDto;
import com.nitish.blog.repositories.UserRepo;
import com.nitish.blog.services.UserService;


public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepo userRepo;

	@Override
	public UserDto createUser(UserDto user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto updateUser(UserDto user, Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto getUserById(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDto> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(Integer userId) {
		// TODO Auto-generated method stub

	}
	
	private User dtoToUser(UserDto userDto) {
		User user = new User();
		user.setId(userDto.getId());
		user.setName (userDto.getName());
		user.setEmail(userDto.getEmail());
		user. setAbout (userDto.getAbout ());
		user.setPassword(userDto.getPassword());
		return user;
	}
	
	public UserDto userToDto(User user) {
		UserDto userDto = new UserDto();
		userDto.setId(user.getId());
		userDto. setName (user.getName());
		userDto.setEmail(user.getEmail());
		userDto.setPassword(user.getPassword());
		userDto.setAbout (user.getAbout());
		return userDto;
	}

}
