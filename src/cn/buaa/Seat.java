package cn.buaa;

public interface Seat {
	void massage();
}

class LuxurySeat implements Seat{

	@Override
	public void massage() {
		System.out.println("���ο��Խ��а�Ħ.");
	}
	
}

class LowSeat implements Seat{

	@Override
	public void massage() {
		System.out.println("���β�֧�ְ�Ħ.");
	}
	
}
