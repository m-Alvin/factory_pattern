package cn.demo;

public class BenzFactory implements CarFactory{

	@Override
	public Car createCar() {
		return new Benz();
	}
	
}
