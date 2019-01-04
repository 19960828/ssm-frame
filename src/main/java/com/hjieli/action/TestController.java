package com.hjieli.action;

import com.hjieli.core.springframework.annotation.ReqMapping;
import com.hjieli.core.springframework.annotation.ResBody;

public class TestController {

	@ReqMapping("test/abc")
	@ResBody
	public String index() {
		return "test";
	}
}
