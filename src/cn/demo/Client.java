package cn.demo;

/**
 * ���Թ�������ģʽ
 * @author Miao
 * �ŵ�:������������ԭ���������࣬����Ҫ�ı����еĴ��룩
 * ȱ��:��������Ƚ϶�
 */
public class Client {
	
	public static void main(String[] args) {
		Audi audi = (Audi) new AudiFactory().createCar();
		Benz benz = (Benz) new BenzFactory().createCar();
		
		audi.run();
		benz.run();
	}
	
}
