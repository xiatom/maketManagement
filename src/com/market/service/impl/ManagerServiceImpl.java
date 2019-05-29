package com.market.service.impl;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.market.mapper.ManagerMapper;
import com.market.model.Manager;
import com.market.service.ManagerService;

/**
 * 项目名: MarketManagement 包名: com.market.service.impl 文件名:
 * ManagerServiceImpl.java 创建时间: 2019年5月29日
 * 
 * @author: xiatom 描述:
 * 
 *
 **/
// 注解是告诉spring，当Spring要创建ManagerServiceImpl的的实例时，bean的名字必须叫做"managerService"，
// 这样当Action需要使用ManagerServiceImpl的的实例时,就可以由Spring创建好的"managerService"，然后注入给Action。
@Service("managerService")
public class ManagerServiceImpl implements ManagerService {

	
	
	@Autowired
	ManagerMapper managerMapper;

	@Override
	public Integer checkManager(Manager manager) {
		return managerMapper.checkManager(manager);
	}

}
