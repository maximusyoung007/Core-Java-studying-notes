package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/*
 * 控制类 IndexController实现接口Controller ，提供方法handleRequest处理请求
* SpringMVC通过 ModelAndView 对象把模型和视图结合在一起
 * 表示视图是index.jsp
 * 模型数据是 message，内容是 “Hello Spring MVC”
 */
@Controller //表示该类是一个控制器
public class IndexController{
	@RequestMapping("/index")
	public ModelAndView handleRequest(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("message","Hello Spring MVC hhh");
		return mav;
	}
	//客户端跳转
	@RequestMapping("/jump")
	public ModelAndView jump() {
		ModelAndView mav = new ModelAndView("redirect:/index");
		return mav;
	}
	
	@RequestMapping("/check")
	public ModelAndView check(HttpSession session) {
		Integer i = (Integer)session.getAttribute("count");
		if(i == null)
			i = 0;
		i++;
		session.setAttribute("count", i);
		ModelAndView mav = new ModelAndView("check");
		return mav;
	}
	
	@RequestMapping("/clear")
	public ModelAndView clear(HttpSession session) {
		session.removeAttribute("count");
		ModelAndView mav = new ModelAndView("redirect:/check");
		return mav;
	}
}
