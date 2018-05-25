package zp_test.springboot_server.zp.agent;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zp.test.agent.TestAgent;
import zp.test.dto.ResultDto;
import zp.test.dto.TestDto;
import zp.test.dto.base.page.PageInfo;
import zp_test.springboot_server.zp.service.ITestService;
@Service("testAgent")
public class TestAgentImpl implements TestAgent {
	@Autowired
	private ITestService testService;
	
	public int selectCountByMap(Map<Object, Object> map) {
		return testService.selectCountByMap(map);
	}

	public ResultDto insertSelective(TestDto record) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public TestDto selectByPrimaryKey(String limitId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultDto updateByPrimaryKeySelective(TestDto record) {
		// TODO Auto-generated method stub
		return null;
	}

	public PageInfo<TestDto> selectListByMap(Map<Object, Object> map, int pageNo, int pageSize, String sort) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<TestDto> selectListByMap(Map<Object, Object> map) {
		// TODO Auto-generated method stub
		return null;
	}

}
