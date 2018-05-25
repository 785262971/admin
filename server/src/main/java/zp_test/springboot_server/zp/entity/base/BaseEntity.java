package zp_test.springboot_server.zp.entity.base;

import java.beans.Transient;
import java.io.Serializable;


/**
 * 
 * 类名：BaseEntity  <br />
 *
 * 功能：	增加一个  dynamicTableName 字段，这个字段并不存在于数据库中，虚拟字段
 *
 * @author : alexgaoyh <br />
 * @Date : 2017年1月10日 上午11:13:47  <br />
 * @version : 2017年1月10日 <br />
 */
public class BaseEntity implements Serializable, IDynamicTableName {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 动态表名部分，与数据库内真是的字段无关性
	 */
    private String dynamicTableName;


	@Transient
	public String getDynamicTableName() {
		if(this.dynamicTableName != null && !this.dynamicTableName.equals("")) {
			return dynamicTableName;
		} else {
			String simpleNameTemp = this.getClass().getSimpleName();
			String tableNameTemp = simpleNameTemp.toUpperCase();
			return tableNameTemp;
		}
		
	}

	public void setDynamicTableName(String dynamicTableName) {
		this.dynamicTableName = dynamicTableName;
	}

}
