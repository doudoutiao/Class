package day011;

public interface USB {

	void service();// 默认都是public abstract
	

}

class Mouse implements USB {

	@Override
	public void service() {
		System.out.println("拓展USB的鼠标功能");
	}

}

class Disk implements USB{

	@Override
	public void service() {
		System.out.println("获取电流,拓展存储功能");
	}
	
}

class Keyboard implements USB{

	@Override
	public void service() {
		
	}
	
}