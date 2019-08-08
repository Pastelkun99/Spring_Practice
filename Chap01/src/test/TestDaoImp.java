package test;

import org.springframework.stereotype.Component;

@Component
public class TestDaoImp implements TestDao {
	// Bean 객체가 된다.
	@Override
	public void print() {
		System.out.println("실행 확인");
	}
	
}
