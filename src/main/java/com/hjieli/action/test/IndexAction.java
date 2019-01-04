package com.hjieli.action.test;


import com.hjieli.core.springframework.annotation.ReqMapping;
import com.hjieli.core.springframework.annotation.ResBody;

public class IndexAction {

	@ReqMapping("demo")
	@ResBody
	public String demo() {
		return "demo";
	}
}
