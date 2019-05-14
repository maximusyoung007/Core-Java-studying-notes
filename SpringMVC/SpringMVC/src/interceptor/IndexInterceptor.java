package interceptor;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class IndexInterceptor extends HandlerInterceptorAdapter{
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response,Object handler) {
		System.out.println("preHandle(), 在访问Controller之前被调用"); 
        return true;
	}
	
	public void postHandle(HttpServletRequest request,HttpServletResponse response,
			Object handler,ModelAndView modelAndView) {
		System.out.println("postHandle(), "
		+ "在访问Controller之后，访问视图之前被调用,这里可以注入一个时间到modelAndView中，用于后续视图显示");
		modelAndView.addObject("date","由拦截器产生的时间：" + new Date());
	}
	
	public void afterCompletion(HttpServletRequest request,HttpServletResponse resopnse,
			Object handler,Exception ex) {
		System.out.println("afterCompletion(), 在访问视图之后被调用"); 
	}
}
