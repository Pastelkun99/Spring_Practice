package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		
		// 스프링을 통해 가져온다.
		ApplicationContext context = 
					new FileSystemXmlApplicationContext("src/test/test.xml");
		TestDao testDao = (TestDao)context.getBean("testDaoImp");
		
		System.out.println("Start...");
		testDao.print();
		// Spring에 의해서 생성된 객체
		System.out.println("End...");
		

	}

}
