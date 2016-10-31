package com.bawei.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/**
 *����ģʽ 
	����ģʽ�������ǣ�Ϊ���������ṩһ�ִ����Կ��ƶ��������ķ��ʡ���ĳЩ����£�
	һ���ͻ�������߲���ֱ��������һ�����󣬶������������ڿͻ��˺�Ŀ�����֮�����н�����á� 
	����ģʽһ���漰��������ɫ�� 
	1�������ɫ��������ʵ����ʹ������Ĺ�ͬ�ӿڣ� 
	2�������ɫ����������ṩ����ʵ������ͬ�Ľӿ��Ա����κ�ʱ�̶��ܴ�����ʵ����ͬʱ��������������ִ����ʵ�������ʱ�����������Ĳ������൱�ڶ���ʵ������з�װ�� 
	3����ʵ��ɫ�������ɫ���������ʵ��������������Ҫ���õĶ��� 
 * date: 2016��10��19�� ����9:44:48 <br/>
 * * @author fdz
 */
public class CommomInvocationHandler implements InvocationHandler{
    //����������
	private Object proxyTarget;
    //��ȡ�������ʵ��
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
