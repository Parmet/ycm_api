package com.ycm_api.business.api.sys.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ycm_api.business.api.sys.controller.intf.ILoginController;
import com.ycm_api.business.api.sys.service.intf.ILoginService;
import com.ycm_api.core.response.R;

@RestController
public class LoginController implements ILoginController
{
	@Autowired
	private ILoginService loginService;
	
	@Override
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public R login(@RequestParam(value = "account", required = false) String account,
				   @RequestParam(value = "password", required = false) String password) 
	{
		R r = loginService.login(account, password);
		return r;
	}

	@Override
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public R logout() 
	{
		System.out.println("logout");
		return null;
	}

}
