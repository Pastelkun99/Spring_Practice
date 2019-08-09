package test.exam6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ExamMain {

	public static void main(String[] args) {
		ApplicationContext context = 
				new FileSystemXmlApplicationContext("src/test/exam6/test.xml");
		
		BeanTest beantest1 = (BeanTest)context.getBean("beanTest");
		BeanTest beantest2 = (BeanTest)context.getBean("beanTest");
		
		System.out.println("beantest1" + beantest1);
		System.out.println("beantest2" + beantest2);
	}
}
