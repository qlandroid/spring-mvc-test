package com.ql.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {

	@RequestMapping("/showView")
	public ModelAndView showView(String name,String password){
		ModelAndView modelAndView = new ModelAndView();  
	     modelAndView.setViewName( "viewName" );  
	     modelAndView.addObject( " 需要放到 model 中的属性名称 " , " 对应的属性值，它是一个对象 " );  
	     System.out.println("运行到这里了");
		return modelAndView;
	}
}
