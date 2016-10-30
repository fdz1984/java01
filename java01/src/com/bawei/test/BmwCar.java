package com.bawei.test;
/**
 * ClassName: BmwCar <br/>
 * 定义宝马汽车. <br/>
 * date: 2016年10月19日 下午8:16:14 <br/>
 * * @author fdz
 */
public class BmwCar implements ICar{
	@Override
	public void run() {
		System.out.println("宝马汽车在跑..");
	}
	@Override
	public void stop() {
		System.out.println("宝马汽车停了...");
	}
}
