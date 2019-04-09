package filter;
 
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
 
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class AuthFilter implements Filter {
 
    @Override
    public void destroy() {
 
    }
 
    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;
 
        //首先判断是否是访问的login.html和loginHero，因为这两个页面就是在还没有登陆之前就需要访问的
        String uri = request.getRequestURI();
        if (uri.endsWith("login.html") || uri.endsWith("login")) {
            chain.doFilter(request, response);
            return;
        }
        
        //从Session中获取userName，如果没有，就表示不曾登陆过，跳转到登陆页面
        String userName = (String) request.getSession().getAttribute("userName");
        if (null == userName) {
            response.sendRedirect("login.html");
            return;
        }
 
        chain.doFilter(request, response);
    }
 
    @Override
    public void init(FilterConfig arg0) throws ServletException {
 
    }
 
}