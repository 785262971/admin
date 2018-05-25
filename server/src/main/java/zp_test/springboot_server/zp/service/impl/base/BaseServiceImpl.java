package zp_test.springboot_server.zp.service.impl.base;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import zp_test.springboot_server.zp.dao.base.BaseMapper;
import zp_test.springboot_server.zp.service.base.IBaseService;




public class BaseServiceImpl<T> implements IBaseService<T> {

	@Autowired(required=false)
	protected BaseMapper<T> mapper;

	public int deleteByPrimaryKey(String limitId) {
		// TODO Auto-generated method stub
		return mapper.deleteByPrimaryKey(limitId);
	}

	public int selectCountByMap(Map<Object, Object> map) {
		// TODO Auto-generated method stub
		return mapper.selectCountByMap(map);
	}

	public List<T> selectListByMap(Map<Object, Object> map, int pageNo, int pageSize, String sort) {
		// TODO Auto-generated method stub
		return mapper.selectListByMap(map);
	}

	public List<T> selectListByMap(Map<Object, Object> map) {
		// TODO Auto-generated method stub
		return mapper.selectListByMap(map);
	}

	public int insert(T record) {
		// TODO Auto-generated method stub
		return mapper.insert(record);
	}

	public int insertSelective(T record) {
		// TODO Auto-generated method stub
		return mapper.insertSelective(record);
	}

	public T selectByPrimaryKey(String limitId) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(limitId);
	}

	public int updateByPrimaryKeySelective(T record) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(T record) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKey(record);
	}
	
	
	
}
