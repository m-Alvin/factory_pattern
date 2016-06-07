package cn.buaa;

public interface Seat {
	void massage();
}

class LuxurySeat implements Seat{

	@Override
	public void massage() {
		System.out.println("座椅可以进行按摩.");
	}
	
}

class LowSeat implements Seat{

	@Override
	public void massage() {
		System.out.println("座椅不支持按摩.");
	}
	
}
