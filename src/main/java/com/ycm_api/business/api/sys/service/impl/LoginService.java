package com.ycm_api.business.api.sys.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ycm_api.business.api.sys.service.intf.ILoginService;
import com.ycm_api.business.database.dao.UserDao;
import com.ycm_api.business.database.entity.SUser;
import com.ycm_api.core.data.Const;
import com.ycm_api.core.response.R;

@Service
public class LoginService implements ILoginService
{
	@Autowired
	private UserDao userDao;
	
	@Override
	public R login(String account, String password) 
	{
		R r = new R();
		
		try 
		{
			SUser user = this.userDao.getUserInfoByName(account);
			if (user == null || user.getId().longValue() <= 0)
			{
				r.fail(Const.R_CODE_FAIL, "该用户不存在");
				return r;
			}
			
			r.success(user);
		}
		catch (Exception e) 
		{
			r.exception();
			e.printStackTrace();
			return r;
		}
		
		return r;
	}

	@Override
	public R logout() 
	{
		return null;
	}
	
}
