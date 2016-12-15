package com.ycm_api.business.api.sys.controller.intf;

import com.ycm_api.core.response.R;

public interface ILoginController 
{
	R login(String account, String password);
	
	R logout();
}
