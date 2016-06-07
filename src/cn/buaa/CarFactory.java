package cn.buaa;

public interface CarFactory {
	
	Car createCar();
}

class LuxuryCarFactory implements CarFactory {

	@Override
	public Car createCar() {
		Car car = new Car();
		car.setEngine(new LuxuryEngine());
		car.setSeat(new LuxurySeat());
		car.setTyre(new LuxuryTyre());
		return car;
	}
	
}

class LowCarFactory implements CarFactory {

	@Override
	public Car createCar() {
		Car car = new Car();
		car.setEngine(new LowEngine());
		car.setSeat(new LowSeat());
		car.setTyre(new LowTyre());
		return car;
	}
	
}