package com.bawei.test;
/**
 * 
 * ClassName: BenzCar <br/>
 * 奔驰汽车. <br/>
 * date: 2016年10月19日 下午8:15:28 <br/>
 * * @author fdz
 */
public class BenzCar implements ICar{

	@Override
	public void run() {
		System.out.println("奔驰汽车在跑");
	}
	@Override
	public void stop() {
        System.out.println("奔驰汽车停车了");		
	}
	
}

