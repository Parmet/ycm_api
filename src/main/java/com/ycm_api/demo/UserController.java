//package com.ycm_api.demo;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/users")
//public class UserController {
//	static Map<Long, User> users = Collections.synchronizedMap(new HashMap<Long, User>());
//	
//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public List<User> getUserList()
//	{
//		List<User> userList = new ArrayList<User>(users.values());
//		return userList;
//	}
//	
//	@RequestMapping(value = "/", method = RequestMethod.POST)
//	public String postUser(@ModelAttribute User user)
//	{
//		users.put(user.getId(), user);
//		return "success";
//	}
//	
//	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
//	public User getUser(@PathVariable Long id)
//	{
//		User user = users.get(id.longValue());
//		return user;
//	}
//	
//	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
//	public String putUser(@PathVariable Long id, @ModelAttribute User user)
//	{
//		User oldUser = users.get(id.longValue());
//		oldUser.setName(user.getName());
////		oldUser.setAge(user.getAge());
//		users.put(id, oldUser);
//		
//		return "success";
//	}
//	
//	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
//	public String deleteUser(@PathVariable Long id)
//	{
//		users.remove(id.longValue());
//		return "success";
//	}
//}
