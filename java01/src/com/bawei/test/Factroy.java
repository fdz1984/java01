package com.bawei.test;

/**
 * ���ģʽ֮����ģʽ 
 * ClassName: Test04 <br/>
 * ����ģʽ. <br/>
 * date: 2016��10��18�� ����3:29:41 <br/>
 * * @author fdz
 */
public class Factroy {
	
	//ģʽһ,ͨ�����������������Ӧ��ʵ��
	public static ICar getCarInstance(String type){
		ICar car=null;
		if("BmwCar".equals(type)){
			car= new BmwCar();
		}
		if("BenzCar".equals(type)){
			car= new BenzCar();
		}
		return car;
	}
	//ģʽ��,ͨ��������ƣ�������Ӧ��ʵ��
	public static ICar getCarInstance(String packagename,String type){
		ICar car=null;
		try {
			car = (ICar) Class.forName(packagename+"."+type).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return car;
	}
	public static void main(String[] args) {
		
		//ICar car=Factroy.getCarInstance("BmwCar");
		ICar car=Factroy.getCarInstance("com.bawei.test","BenzCar");
		car.run();
		car.stop();
	}
}