package test.exam3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ExamMain {

	public static void main(String[] args) {
		 ApplicationContext context = 
				 new FileSystemXmlApplicationContext("src/test/exam3/test.xml");
		 JdbcService jdbcService = (JdbcService)context.getBean("jdbcService");
		 jdbcService.serviceTest();
	}

}
