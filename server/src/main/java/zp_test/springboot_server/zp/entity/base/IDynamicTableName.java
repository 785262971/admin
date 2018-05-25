

package zp_test.springboot_server.zp.entity.base;



public interface IDynamicTableName {

	/**
     * 获取动态表名 - 这个方法是关键，只要有返回值，不是null和''，就会用返回值作为表名
     *
     * @return
     */
    String getDynamicTableName();
}
