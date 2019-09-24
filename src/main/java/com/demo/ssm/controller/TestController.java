package com.demo.ssm.controller;

import com.demo.ssm.bean.Deptarment;
import com.demo.ssm.dao.DeptarmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "test",produces = "text/plain;charset=utf-8")
public class TestController {
	@Autowired
	private DeptarmentMapper dp;
	
	@RequestMapping("test")
	@ResponseBody
	public String test() {
		Deptarment deptarment = dp.selectByPrimaryKey(1);
		System.out.println("测试");
		return deptarment.getDeptName();
	}
}
