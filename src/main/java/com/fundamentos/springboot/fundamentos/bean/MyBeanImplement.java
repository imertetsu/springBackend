package com.fundamentos.springboot.fundamentos.bean;

public class MyBeanImplement implements BeanWithDependency{

    private MyOperation myOperation;
    public MyBeanImplement(MyOperation myOperation){
        this.myOperation = myOperation;
    }
    @Override
    public void imprimir() {
        System.out.println(this.myOperation.sum(5));
        System.out.println("hola desde Bean");
    }
}
