package com.bawei.test;
/**
 * ClassName: BmwCar <br/>
 * ���屦������. <br/>
 * date: 2016��10��19�� ����8:16:14 <br/>
 * * @author fdz
 */
public class BmwCar implements ICar{
	@Override
	public void run() {
		System.out.println("������������..");
	}
	@Override
	public void stop() {
		System.out.println("��������ͣ��...");
	}
}
