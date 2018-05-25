package zp_test.springboot_server.zp.dao.base;

import java.util.List;
import java.util.Map;


/**
 * 通用Mapper接口,其他接口继承该接口即可
 * <p/>
 * <p>
 * 这是一个例子，自己扩展时可以参考
 * </p>
 *
 * @param <T>
 *            不能为空
 */
public interface BaseMapper<T> {
	/**
	 * 通过主键删除
	 * 
	 * @param limitId
	 * @return
	 */
	int deleteByPrimaryKey(String limitId);

	/**
	 * 根据查询条件统计个数
	 * 
	 * @param map
	 * @return
	 */

	int selectCountByMap(Map<Object, Object> map);

	/**
	 * 查询通过map传递的值
	 * 
	 * @param map
	 * @return
	 */

	List<T> selectListByMap(Map<Object, Object> map);

	/**
	 * 插入
	 */
	int insert(T record);

	/**
	 * 根据传入的数据插入
	 * 
	 * @param record
	 * @return
	 */
	int insertSelective(T record);

	/**
	 * 根据主键查询
	 * 
	 * @param limitId
	 * @return
	 */
	T selectByPrimaryKey(String limitId);

	/**
	 * 通过主键更新
	 * 
	 * @param record
	 * @return
	 */

	int updateByPrimaryKeySelective(T record);

	/**
	 * 通过通过主键更新
	 * 
	 * @param record
	 * @return
	 */

	int updateByPrimaryKey(T record);
	
}