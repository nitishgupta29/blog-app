package com.nitish.blog.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import com.nitish.blog.exceptions.ResourceNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.nitish.blog.entities.User;
import com.nitish.blog.payloads.UserDto;
import com.nitish.blog.repositories.UserRepo;
import com.nitish.blog.services.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepo userRepo;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public UserDto createUser(UserDto userDto) {
		User user=this.dtoToUser(userDto);
        User savedUser=this.userRepo.save(user);
		return this.userToDto(savedUser);
	}

	@Override
	public UserDto updateUser(UserDto userDto, Integer userId) {
		User user =this.userRepo.findById(userId).orElseThrow(()->new ResourceNotFoundException("User","id",userId));
		user.setName(userDto.getName());
		user.setEmail(userDto.getEmail());
		user.setPassword(userDto.getPassword());
		user.setAbout(userDto.getAbout());
		User updatedUser=this.userRepo.save(user);
		UserDto userDto1=this.userToDto(updatedUser);
		return userDto1;
	}

	@Override
	public UserDto getUserById(Integer userId) {
		User user=this.userRepo.findById(userId).orElseThrow(()->new ResourceNotFoundException("User","id",userId));

		return this.userToDto(user);
	}

	@Override
	public List<UserDto> getAllUsers() {
		List<User> users= this.userRepo.findAll();
		List<UserDto> userDtos=users.stream().map(user -> this.userToDto(user)).collect(Collectors.toList());
		return userDtos;
	}

	@Override
	public void deleteUser(Integer userId) {
		User user=this.userRepo.findById(userId).orElseThrow(()->new ResourceNotFoundException("User","id",userId));
		this.userRepo.delete(user);
	}
	
	private User dtoToUser(UserDto userDto) {
//		User user = new User();            Now use ModelMapper to convert UserDto to User and vice-versa.
//		user.setId(userDto.getId());
//		user.setName (userDto.getName());
//		user.setEmail(userDto.getEmail());
//		user. setAbout (userDto.getAbout ());
//		user.setPassword(userDto.getPassword());

		User user =this.modelMapper.map(userDto,User.class);
		return user;
	}
	
	public UserDto userToDto(User user) {
//		UserDto userDto = new UserDto();
//		userDto.setId(user.getId());
//		userDto. setName (user.getName());
//		userDto.setEmail(user.getEmail());
//		userDto.setPassword(user.getPassword());
//		userDto.setAbout (user.getAbout());

		UserDto userDto=this.modelMapper.map(user,UserDto.class);
		return userDto;
	}

}
