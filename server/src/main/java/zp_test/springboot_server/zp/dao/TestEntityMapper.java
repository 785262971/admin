package zp_test.springboot_server.zp.dao;

import org.apache.ibatis.annotations.Mapper;

import zp_test.springboot_server.zp.dao.base.BaseMapper;
import zp_test.springboot_server.zp.entity.TestEntity;
@Mapper
public interface TestEntityMapper extends BaseMapper<TestEntity> {
   
}