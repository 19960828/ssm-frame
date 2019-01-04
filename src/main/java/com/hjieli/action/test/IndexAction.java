package com.hjieli.action.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class IndexAction {

	@RequestMapping("demo")
	@ResponseBody
	public String demo() {
		return "demo";
	}
}
