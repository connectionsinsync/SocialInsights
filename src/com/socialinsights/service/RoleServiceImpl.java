/*
 * Author : Rantidev Singh
 * Updated On: 10 July 2014
 * Updated By:Rantidev Singh
 * 
 */
package com.socialinsights.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.socialinsights.dao.RoleDAO;
import com.socialinsights.model.Role;

@Service
@Transactional
public class RoleServiceImpl implements RoleService {
	
	@Autowired
	private RoleDAO roleDAO;

	public Role getRole(int id) {
		return roleDAO.getRole(id);
	}

}
