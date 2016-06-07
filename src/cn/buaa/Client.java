package cn.buaa;

/**
 * 测试抽象工厂模式
 * @author Miao
 *
 */
public class Client {
	public static void main(String[] args) {
		Car car = new LuxuryCarFactory().createCar();
		car.getEngine().start();
		car.getSeat().massage();
		car.getTyre().revolve();
	}
}
