package test.exam7;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;

public class LifeBeanImpl implements LifeBean, BeanNameAware, BeanFactoryAware {
	
	private String beanName;				// 설정파일에서 설정한 빈의 id를 저장할 변수
	private BeanFactory beanFactory;	// 스프링의 beanfactory 구현체를 저장할 변수
	 
	public void begin() {
		System.out.println("사용자 초기화 메소드");
	}
	
	public void destroy() {
		System.out.println("사용자 소멸 메소드");
	}

	// 객체가 생성될때 스프링의 BeanFactory를 전달받는 메소드
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
	}

	// bean 객체가 자기 자신의 이름을 알아야 할 경우에 사용
	// 객체가 생성될 때 해당 객체의 id값을 전달받는 메서드
	@Override
	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}

	@Override
	public void lifeMethod() {
		System.out.println("비지니스 로직이 수행중입니다.");
		System.out.println("beanName = "+ beanName);
	}
	
	
}
