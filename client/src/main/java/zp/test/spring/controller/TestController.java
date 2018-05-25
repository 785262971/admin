package zp.test.spring.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import zp.test.agent.TestAgent;
import zp.test.spring.controller.base.BaseController;

@Controller
@RequestMapping("/test/test")
public class TestController extends BaseController {
	@Autowired
	private TestAgent agent;
	
	/**
	 * 修改上架状态
	 * @param request
	 * @param response
	 * @param model
	 * @param pageNo
	 * @param searchDataStr
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping(value = "/list")
	public void changeItemState(HttpServletRequest request,HttpServletResponse response) throws Exception{
		Map<Object,Object> map=new HashMap<Object, Object>();
		int i=agent.selectCountByMap(map);
		sendAjaxResponse(response, i);
	}

 
}
