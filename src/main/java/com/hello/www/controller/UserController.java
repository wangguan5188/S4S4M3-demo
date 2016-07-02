package com.hello.www.controller;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.hello.www.common.util.StringUtil;
import com.hello.www.service.UserService;

@Controller
@RequestMapping(value = "/user/")
public class UserController {
	
	@Autowired
	private UserService userService;

	/**
	 * 跳转到登录页面
	 * @param modelMap
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "toLogin.html")
	public ModelAndView toLogin(ModelMap modelMap, HttpServletRequest request) {
		
		return new ModelAndView("login", modelMap);
	}
	
	/**
	 * 用户身份登录验证
	 * @param modelMap
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "login.html")
	public ModelAndView login(ModelMap modelMap, HttpServletRequest request) {
		String message = "";//提示信息
		String username = StringUtil.toString(request.getParameter("username"), null);
		String password = StringUtil.toString(request.getParameter("password"), null);
		Map<String, Object> user = null;
		if(username!=null && password!=null) {
			password = "74AEBE10C6455194CD0D1E6E8E02FFFE";
			user = userService.queryUser(username, password);
		}
		if(user != null) {
			message = "登录成功.";
			System.out.println(message);
			System.out.println(user);
			modelMap.put("message", message);
			return new ModelAndView("redirect:/index.html", modelMap);
		}
		message = "用户名或密码错误.";
		System.out.println(message);
		modelMap.put("message", message);
		return new ModelAndView("login", modelMap);
	}
	
}
