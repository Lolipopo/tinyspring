package cn.codecraft.tinyioc;

import org.junit.Test;

public class BeanFactoryTest {
	@Test
	public void test() {
		//1.初始化beanFactory
		BeanFactory beanFactory = new BeanFactory();
		
		//2.在工厂中注入bean
		BeanDefinition beanDefinition = new BeanDefinition(new HelloWorldService());
		beanFactory.registerBeanDefinition("helloWorldService", beanDefinition);
		
		//3.从工厂中获得bean
		HelloWorldService helloWorldService = (HelloWorldService) beanFactory.getBean("helloWorldService");
		helloWorldService.helloWorld();
	}
}
