package com.ycm_api.business.database.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ycm_api.business.database.entity.SUser;

public interface UserDao extends JpaRepository<SUser, Long>, JpaSpecificationExecutor<SUser> 
{
	static final String TABLE_NAME = "s_user";
	
	@Query(value = "select * from " + TABLE_NAME + " where name=:name", nativeQuery = true)
	SUser getUserInfoByName(@Param("name") String name);
}
