package cn.buaa;

public interface Engine {
	void start();
}

class LuxuryEngine implements Engine {

	@Override
	public void start() {
		System.out.println("引擎启动快.");
	}
	
}

class LowEngine implements Engine {

	@Override
	public void start() {
		System.out.println("引擎启动慢.");
	}
	
}