/*
 * Author : Rantidev Singh
 * Updated On: 02 July 2014
 * Updated By:Rantidev Singh
 * 
 */
package com.socialinsights.dao;

import com.socialinsights.model.User;

public interface UserDAO {
	
	public User getUser(String login);

}
