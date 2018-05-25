package zp_test.springboot_server;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

import zp.test.agent.TestAgent;

/**
 * Hello world!
 *
 */

@EnableAutoConfiguration
@SpringBootApplication
@ImportResource({"classpath:spring-dubbo.xml"})
@ComponentScan(basePackages={"zp_test.springboot_server"})
public class App 
{

    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        builder.sources(App.class);
        return builder.sources(App.class);
    }
    @Bean
    public CountDownLatch closeLatch() {
        return new CountDownLatch(1);
    }

    public static void main(String[] args) throws Exception {
		ApplicationContext ctx = new SpringApplicationBuilder().sources(App.class).web(false)
				.run(args);
		System.out.println("HelloWorld!");
		TestAgent agent=ctx.getBean(TestAgent.class);
		Map<Object, Object> map=new HashMap<Object, Object>();
		int  i = agent.selectCountByMap(map);
		CountDownLatch closeLatch = ctx.getBean(CountDownLatch.class);
		closeLatch.await();

	}
}
