package com.fortnight.security_service.service;

import org.springframework.security.core.userdetails.UserDetails;

import com.fortnight.security_service.exception.ApiException;

import domain.User;

public interface UserService extends UserDetails {
    
    //public Info register(String username, String password, Long profileId, String accessToken, String name, String surname, String ip);
	
	public User  getUserById(Long id) throws ApiException;
	
	public User  getUserByProfileId(Long profileId) throws ApiException;
	
	public void checkUserSuitableForProcess(Long userId) throws ApiException;

	//public void changeUserStatus(Long userId, UserStatus status);

	//public void changeUserStatus(User user, UserStatus status);
	
	//public Long addUserAuthority(User user, AuthorityType authorityType);

	//public Long makeUserAsCommenter(Long userId, String token) throws ApiException;

	public void updateUser(User user);
	
}
