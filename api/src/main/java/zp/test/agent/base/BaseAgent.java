package zp.test.agent.base;

import java.util.List;
import java.util.Map;

import zp.test.dto.ResultDto;
import zp.test.dto.base.page.PageInfo;

public interface BaseAgent<E> {
	/**
	 * 根据查询条件统计个数
	 * 
	 * @param map
	 * @return
	 */

	int selectCountByMap(Map<Object, Object> map);
	/**
	 * 根据传入的数据插入
	 * 
	 * @param record
	 * @return
	 */
	ResultDto insertSelective(E record) throws Exception;
	
	/**
	 * 根据主键查询
	 * 
	 * @param limitId
	 * @return
	 */
	E selectByPrimaryKey(String limitId) throws Exception;

	/**
	 * 通过主键更新
	 * 
	 * @param record
	 * @return
	 */

	ResultDto updateByPrimaryKeySelective(E record);
	/**
	 * 根据map查询list
	 * @param map
	 * @param pageNo
	 * @param pageSize
	 * @param sort
	 * @return
	 */
	PageInfo<E> selectListByMap(Map<Object, Object> map,int pageNo, int pageSize,String sort);
	/**
	 * 不带分页的查询list
	 * @param map
	 * @return1
	 */
	List<E> selectListByMap(Map<Object,Object> map);
}
