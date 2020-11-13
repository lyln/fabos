package com.lyln.fabos;

import com.lyln.fabos.common.annotation.FABOS权限系统;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//@SpringBootApplication
@FABOS权限系统
public class FabosApplication {

//	@GetMapping("test")
//	public String test(){
//		return "index";
//	}

	public static void main(String[] args) {
		//SpringApplication.run(FabosApplication.class, args);
		new SpringApplicationBuilder(FabosApplication.class)
					.web(WebApplicationType.SERVLET)
					.run(args);
	}

}
