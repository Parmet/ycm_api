package com.ycm_api.business.api.sys.service.intf;

import com.ycm_api.core.response.R;

public interface ILoginService 
{
	R login(String account, String password);
	
	R logout();
}
