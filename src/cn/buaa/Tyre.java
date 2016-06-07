package cn.buaa;

public interface Tyre {
	void revolve();
}

class LuxuryTyre implements Tyre {

	@Override
	public void revolve() {
		System.out.println("ÂÖÌ¥ÄÍÄ¥Ëğ.");
	}
	
}

class LowTyre implements Tyre {

	@Override
	public void revolve() {
		System.out.println("ÂÖÌ¥Ä¥Ëğ¿ì.");
	}
	
}
