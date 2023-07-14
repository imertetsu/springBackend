package com.fundamentos.springboot.fundamentos;

import com.fundamentos.springboot.fundamentos.bean.BeanWithDependency;
import com.fundamentos.springboot.fundamentos.bean.MyBean;
import com.fundamentos.springboot.fundamentos.component.ComponentDependency;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {

	private ComponentDependency componentDependency;
	private ComponentDependency componentDependencyTwo;
	private MyBean myBean;
	private BeanWithDependency beanWithDependency;

	public FundamentosApplication(
			@Qualifier("componentTwoImplement") ComponentDependency componentDependency2,
			@Qualifier("componentImplement") ComponentDependency componentDependency,
			MyBean myBean,
			BeanWithDependency beanWithDependency
			){
		this.componentDependencyTwo = componentDependency2;
		this.componentDependency = componentDependency;
		this.myBean = myBean;
		this.beanWithDependency = beanWithDependency;
	}
	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		componentDependency.saludar();
		componentDependencyTwo.saludar();
		myBean.print();
		beanWithDependency.imprimir();
	}
}
