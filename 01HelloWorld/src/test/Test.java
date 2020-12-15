package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import beans.Bean;

public class Test
{
	public static void main(String[] args) throws Exception
	{
		//Resource resource = new FileSystemResource("src/resources/spring.xml");
		
		Resource resource = new ClassPathResource("resources/spring.xml");
		
		BeanFactory bean = new XmlBeanFactory(resource);
		Object o = bean.getBean("b");
		Bean b = (Bean)o;
		b.hello();
	}

}
