package com.hello.www.controller;

import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.hello.www.service.UserService;

@Controller
public class IndexController {
	
	@Autowired
	private UserService userService;

	@RequestMapping(value = "index.html")
	public ModelAndView index(ModelMap modelMap, HttpServletRequest request) {
		List<Map<String, Object>> userList = userService.queryAll();
		System.out.println(userList);
		return new ModelAndView("index", modelMap);
	}
	
}
