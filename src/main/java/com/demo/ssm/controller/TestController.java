package com.demo.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "test",produces = "text/plain;charset=utf-8")
public class TestController {
	@RequestMapping("test")
	@ResponseBody
	public String test() {
		System.out.println("测试");
		return "你好";
	}
}
