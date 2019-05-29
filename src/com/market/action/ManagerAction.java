package com.market.action;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


//@Controller标明下面这个时控制器类，使用其标注的类就是一个SpringMVC Controller对象
@Controller
//@RequestMapping是一个用来处理请求地址映射的注解，可用于类或方法上
//用于类上表示类中的所有响应请求的方式都是以改地址作为父路径。这里是/user
@RequestMapping("/manager")
public class ManagerAction {
	@RequestMapping("/login")
	@ResponseBody
	public String checkUser(HttpServletRequest req) {
		System.out.println(req.getParameter("manager_id"));
		System.out.println(req.getParameter("manager_pwd"));
		return "Demo_return_page";
	}
}
