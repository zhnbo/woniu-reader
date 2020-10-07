package com.woniuxy.exception;

import com.alibaba.fastjson.support.spring.FastJsonJsonView;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;


@Controller
public class ResourceNotFoundController implements ErrorController{

	@Override
	public String getErrorPath() {
		return "/error";
	}

	public ModelAndView handlerResourceNotFound(HttpServletRequest request) throws Exception {
		// 创建 ModelAndView
		ModelAndView mv = new ModelAndView();
		// 获取请求头信息，用于判断是否为 ajax 请求
		String requestType = request.getHeader("x-requested-with");
		// 判断是否为 Ajax 请求
		if (requestType != null && requestType.equalsIgnoreCase("XMLHttpRequest")) {
			// 创建 JsonView
			FastJsonJsonView jsonView = new FastJsonJsonView();
			// 定义 Map 储存异常信息
			HashMap<String,String> map = new HashMap<String,String>(6);
			map.put("code", "404");
			map.put("message", "资源找不到");
			jsonView.setAttributesMap(map);
			mv.setView(jsonView);
		} else {
			mv.setViewName("redirect:/error/404.html");
		}
		return mv;
	}
	
}
