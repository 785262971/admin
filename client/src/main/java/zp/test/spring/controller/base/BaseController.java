package zp.test.spring.controller.base;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class BaseController {
	@Resource
	protected HttpServletRequest request;

	public static Logger LOGGER = LoggerFactory.getLogger(BaseController.class);
	

	/**
	 * 返回Ajax响应字符串，将处理结果返回
	 */
	public void sendAjaxResponse(HttpServletResponse response, Object strMsg) {
		PrintWriter out = null;
		try {
			if (response != null) {
				response.setCharacterEncoding("UTF-8");
				response.setContentType("text/json");
				out = response.getWriter();
				out.print(strMsg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (out != null) {
				out.flush();
				out.close();
			}
		}
	}
	public Cookie[] getCookie(HttpServletRequest request){
		return request.getCookies();
	}

	/**
	 * 
	 * 功能：获取Cookie以及返回需要的数据<br/>
	 *
	 * @author xxw
	 * @version 2017年5月23日 上午10:06:37 <br/>
	 */
	public String getUserId(HttpServletRequest request) {
		Cookie[] cookies = getCookie(request);
		String value = "";
		String userId = "";
		for (Cookie cookie : cookies) {
			if ("ztb_user_login_id".equals(cookie.getName())) {
				value = cookie.getValue();
				userId = value.substring(2);
			}
		}
		return userId;
	}

}
