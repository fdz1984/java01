package com.bawei.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/**
 *代理模式 
	代理模式的作用是：为其他对象提供一种代理以控制对这个对象的访问。在某些情况下，
	一个客户不想或者不能直接引用另一个对象，而代理对象可以在客户端和目标对象之间起到中介的作用。 
	代理模式一般涉及到三个角色： 
	1）抽象角色：声明真实对象和代理对象的共同接口； 
	2）代理角色：代理对象提供与真实对象相同的接口以便在任何时刻都能代替真实对象。同时，代理对象可以在执行真实对象操作时，附加其他的操作，相当于对真实对象进行封装。 
	3）真实角色：代理角色所代表的真实对象，是我们最终要引用的对象 
 * date: 2016年10月19日 下午9:44:48 <br/>
 * * @author fdz
 */
public class CommomInvocationHandler implements InvocationHandler{
    //定义代理对象
	private Object proxyTarget;
    //获取代理对象实例
	public void setProxyTarget(Object proxyTarget) {
		this.proxyTarget = proxyTarget;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		return method.invoke(this.proxyTarget, args);
	}

	public static void main(String[] args) {
		CommomInvocationHandler commomInvocation=new CommomInvocationHandler();
		ICar hummer=null;
		commomInvocation.setProxyTarget(new BenzCar());
		hummer=(ICar) Proxy.newProxyInstance(ICar.class.getClassLoader(),new Class[]{ICar.class},commomInvocation);
		hummer.run();
		System.out.println(hummer.getClass());
	}
}
