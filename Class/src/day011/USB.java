package day011;

public interface USB {

	void service();// Ĭ�϶���public abstract
	

}

class Mouse implements USB {

	@Override
	public void service() {
		System.out.println("��չUSB����깦��");
	}

}

class Disk implements USB{

	@Override
	public void service() {
		System.out.println("��ȡ����,��չ�洢����");
	}
	
}

class Keyboard implements USB{

	@Override
	public void service() {
		
	}
	
}