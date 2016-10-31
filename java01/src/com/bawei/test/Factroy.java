package com.bawei.test;

/**
 * 设计模式之工厂模式 
 * ClassName: Test04 <br/>
 * 工厂模式. <br/>
 * date: 2016年10月18日 下午3:29:41 <br/>
 * * @author fdz
 */
public class Factroy {
	
	//模式一,通过传入参数，创建相应的实例
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
	//模式二,通过反射机制，创建相应的实例
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