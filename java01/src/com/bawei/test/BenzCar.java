package com.bawei.test;
/**
 * 
 * ClassName: BenzCar <br/>
 * ��������. <br/>
 * date: 2016��10��19�� ����8:15:28 <br/>
 * * @author fdz
 */
public class BenzCar implements ICar{

	@Override
	public void run() {
		System.out.println("������������");
	}
	@Override
	public void stop() {
        System.out.println("��������ͣ����");		
	}
	
}

