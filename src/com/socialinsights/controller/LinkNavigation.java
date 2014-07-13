/*
 * Author : Rantidev Singh
 * Updated On: 10 July 2014
 * Updated By:Rantidev Singh
 * 
 */

package com.socialinsights.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LinkNavigation {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView homePage() {
		return new ModelAndView("home");
	}
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public ModelAndView indexPage() {
		return new ModelAndView("home");
	}
	
	@RequestMapping(value="/ask-query", method=RequestMethod.GET)
	public ModelAndView askQueryPage() {
		return new ModelAndView("ask-query");
	}
	
	@RequestMapping(value="/my-library", method=RequestMethod.GET)
	public ModelAndView myLibraryPage() {
		return new ModelAndView("my-library");
	}
	
	@RequestMapping(value="/my-profile", method=RequestMethod.GET)
	public ModelAndView myProfilePage() {
		return new ModelAndView("my-profile");
	}
	
	@RequestMapping(value="/innovation", method=RequestMethod.GET)
	public ModelAndView innovationPage() {
		return new ModelAndView("innovation");
	}
	
	@RequestMapping(value="/admin/first", method=RequestMethod.GET)
	public ModelAndView firstAdminPage() {
		return new ModelAndView("admin-first");
	}
	
	@RequestMapping(value="/admin/second", method=RequestMethod.GET)
	public ModelAndView secondAdminPage() {
		return new ModelAndView("admin-second");
	}

}
