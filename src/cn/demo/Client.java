package cn.demo;

/**
 * 测试工厂方法模式
 * @author Miao
 * 优点:符合面向对象的原则（增加新类，不需要改变已有的代码）
 * 缺点:产生的类比较多
 */
public class Client {
	
	public static void main(String[] args) {
		Audi audi = (Audi) new AudiFactory().createCar();
		Benz benz = (Benz) new BenzFactory().createCar();
		
		audi.run();
		benz.run();
	}
	
}
