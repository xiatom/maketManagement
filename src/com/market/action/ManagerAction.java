package com.market.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.market.model.Manager;
import com.market.service.ManagerService;


//@Controller标明下面这个时控制器类，使用其标注的类就是一个SpringMVC Controller对象
//@RequestMapping是一个用来处理请求地址映射的注解，可用于类或方法上
//用于类上表示类中的所有响应请求的方式都是以改地址作为父路径。这里是/user

@RequestMapping("/managerAction")
@Controller
public class ManagerAction {
	
	//自动注入
	@Autowired
	ManagerService managerService;
	
	@RequestMapping("/checkManager")
	//括号中的manager由前端传入自动封装城的
	public String checkUser(Manager manager,Map<String,Manager> map) {	
		Integer managerId = managerService.checkManager(manager);
		if(managerId!=null) {
			manager.setManagerId(managerId);
			map.put("manager", manager);
			return "/manager/home";
		}
		else 
			return "index";
	}
	
//	@RequestMapping("/checkUser")
//	@ResponseBody
//	public String checkUser(User user,HttpServletRequest req) {
//		return "fail";
//	}
}
