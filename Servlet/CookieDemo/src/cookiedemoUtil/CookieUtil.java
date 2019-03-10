package cookiedemoUtil;

import javax.servlet.http.Cookie;

public class CookieUtil {
	//从一个cookie数组中找到我们想要的对象
	public static Cookie findCookie(Cookie[] cookies,String name) {
		if(cookies != null) {
			for(Cookie c : cookies) {
				if(name.equals(c.getName())) {
					return c;
				}
			}
		}
	return null;
	}
}
