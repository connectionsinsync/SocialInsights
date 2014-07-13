/*
 * Author : Rantidev Singh
 * Updated On: 10 July 2014
 * Updated By:Rantidev Singh
 * 
 */
package com.socialinsights.service;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.socialinsights.dao.UserDAO;
import com.socialinsights.model.User;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDAO userDAO;

	public User getUser(String login) {
		return userDAO.getUser(login);
	}

}
