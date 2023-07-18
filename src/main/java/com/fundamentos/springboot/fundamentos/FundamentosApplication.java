package com.fundamentos.springboot.fundamentos;

import com.fundamentos.springboot.fundamentos.bean.BeanWithDependency;
import com.fundamentos.springboot.fundamentos.bean.MyBean;
import com.fundamentos.springboot.fundamentos.component.ComponentDependency;
import com.fundamentos.springboot.fundamentos.configuration.GeneralConfiguration;
import com.fundamentos.springboot.fundamentos.entity.User;
import com.fundamentos.springboot.fundamentos.repository.UserRepo;
import com.fundamentos.springboot.fundamentos.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Slf4j
@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {

	Log LOGGER = LogFactory.getLog(FundamentosApplication.class);

	private ComponentDependency componentDependency;
	private ComponentDependency componentDependencyTwo;
	private MyBean myBean;
	private BeanWithDependency beanWithDependency;

	private UserRepo userRepo;
	public FundamentosApplication(
			/*@Qualifier("componentTwoImplement") ComponentDependency componentDependency2,
			@Qualifier("componentImplement") ComponentDependency componentDependency,
			MyBean myBean,
			BeanWithDependency beanWithDependency,*/
			UserRepo userRepo
			){
		/*this.componentDependencyTwo = componentDependency2;
		this.componentDependency = componentDependency;
		this.myBean = myBean;
		this.beanWithDependency = beanWithDependency;*/
		this.userRepo = userRepo;
	}
	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);

	}

	private void saveUserInDataBase(){
		User user1 = new User("John", "john@domain.com", LocalDate.of(2021, 3, 13));
		User user2 = new User("Marco", "marco@domain.com", LocalDate.of(2021, 12, 8));
		User user3 = new User("Daniela", "daniela@domain.com", LocalDate.of(2021, 9, 8));
		User user4 = new User("Marisol", "marisol@domain.com", LocalDate.of(2021, 6, 18));
		User user5 = new User("Karen", "karen@domain.com", LocalDate.of(2021, 1, 1));
		User user6 = new User("Carlos", "carlos@domain.com", LocalDate.of(2021, 7, 7));
		User user7 = new User("Enrique", "enrique@domain.com", LocalDate.of(2021, 11, 12));
		User user8 = new User("Luis", "luis@domain.com", LocalDate.of(2021, 2, 27));
		User user9 = new User("Paola", "paola@domain.com", LocalDate.of(2021, 4, 10));

		List<User> list = Arrays.asList(user1, user2, user3, user4,user5,user6,user7,user8,user9);
	}
	@Override
	public void run(String... args) throws Exception {
		//examples();
		//saveUserInDataBase();
		User user1 = new User("John", "john@domain.com", LocalDate.of(2021, 3, 13));
		userRepo.saveAndFlush(user1);

	}
	/*public void examples(){
		componentDependency.saludar();
		componentDependencyTwo.saludar();
		myBean.print();
		beanWithDependency.imprimir();
		log.info("entrando al mentodo print");
		//LOGGER.error("esto es un error aplic");
	}*/
}
