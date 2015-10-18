package cn.codecraft.tinyioc;

import org.junit.Test;

public class BeanFactoryTest {
	@Test
	public void test() {
		//1.��ʼ��beanFactory
		BeanFactory beanFactory = new BeanFactory();
		
		//2.�ڹ�����ע��bean
		BeanDefinition beanDefinition = new BeanDefinition(new HelloWorldService());
		beanFactory.registerBeanDefinition("helloWorldService", beanDefinition);
		
		//3.�ӹ����л��bean
		HelloWorldService helloWorldService = (HelloWorldService) beanFactory.getBean("helloWorldService");
		helloWorldService.helloWorld();
	}
}
