package test.exam7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ExamMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new FileSystemXmlApplicationContext("src/test/exam7/life.xml");
		LifeBean bean = (LifeBean)context.getBean("lifeBean");
		
		bean.lifeMethod();
	}
}
