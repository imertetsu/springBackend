package com.fundamentos.springboot.fundamentos.configuration;

import com.fundamentos.springboot.fundamentos.bean.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.fundamentos.springboot.fundamentos.bean.MyOperation;
import com.fundamentos.springboot.fundamentos.bean.BeanWithDependency;
import com.fundamentos.springboot.fundamentos.bean.MyBeanImplement;
import com.fundamentos.springboot.fundamentos.bean.MyBean2Implement;


@Configuration
@ComponentScan("com.fundamentos.springboot.fundamentos.repository")
public class MyConfigurationBean {

    @Bean
    public MyBean myOperation(){
        return new MyBean2Implement();
    }

    @Bean
    public BeanWithDependency beanWithDependencies(MyOperation myOperation){
        return new MyBeanImplement(myOperation);
    }
}
