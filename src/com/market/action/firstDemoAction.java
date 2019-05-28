package com.market.action;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/**
* 项目名:		MarketManagement
* 包名:		com.market.action
* 文件名:		firstDemoAction.java
* 创建时间:	2019年5月28日
* 
* @author:	xiatom
* 描述:		
* 
*
**/
//@Controller标明下面这个时控制器类，使用其标注的类就是一个SpringMVC Controller对象
@Controller
//@RequestMapping是一个用来处理请求地址映射的注解，可用于类或方法上
//用于类上表示类中的所有响应请求的方式都是以改地址作为父路径。这里是/user
@RequestMapping("/Demo_FatherPattern")
public class firstDemoAction {
	@RequestMapping("/Demo_childPatter")
	@ResponseBody
	public String checkUser(HttpServletRequest req) {
		System.out.println(req.getParameter("message"));
		return "Demo_return_page";
	}
}
