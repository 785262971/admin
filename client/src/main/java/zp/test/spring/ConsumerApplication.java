package zp.test.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@SpringBootApplication
@ImportResource("classpath:spring-dubbo.xml")
@ComponentScan(basePackages = { "zp" })
public class ConsumerApplication  extends WebMvcConfigurerAdapter {

	public static Logger LOGGER = LoggerFactory.getLogger(ConsumerApplication.class);
	
	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(ConsumerApplication.class, args);
		System.out.println("项目启动");
	
	}
	@Bean(name = { "multipartResolver" })
	public MultipartResolver multipartResolver() {
		CommonsMultipartResolver cmr = new CommonsMultipartResolver();
		cmr.setMaxInMemorySize(1024);
		return cmr;
	}

	@Bean
	public ServletRegistrationBean dispatcherRegistration(DispatcherServlet dispatcherServlet) {
		ServletRegistrationBean registration = new ServletRegistrationBean(dispatcherServlet);
		registration.getUrlMappings().clear();
		return registration;
	}
	
}
