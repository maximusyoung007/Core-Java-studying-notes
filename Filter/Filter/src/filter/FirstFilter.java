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
/*
 * 一个简单的过滤器，所有用户的访问信息都会被显示出来
 */
public class FirstFilter implements Filter {
 
    @Override
    public void destroy() {
 
    }
 
    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;
 
        String ip = request.getRemoteAddr();
        String url = request.getRequestURL().toString();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = new Date();
        String date = sdf.format(d);
 
        System.out.printf("%s %s 访问了 %s%n", date, ip, url);
        chain.doFilter(request, response);
    }
    
    //filter的init随着Tomcat的启动而启动
    @Override
    public void init(FilterConfig arg0) throws ServletException {
    	System.out.println("FirstFilter init...");
    	
    }
 
}