package zp_test.springboot_server.zp.service.impl;

import org.springframework.stereotype.Service;

import zp_test.springboot_server.zp.entity.TestEntity;
import zp_test.springboot_server.zp.service.ITestService;
import zp_test.springboot_server.zp.service.impl.base.BaseServiceImpl;
@Service("testService")
public class TestServiceImpl extends BaseServiceImpl<TestEntity> implements ITestService {

	

}
