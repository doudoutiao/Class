package day011;

public class Programmer implements Programming {

	@Override
	public void programming() {
		
		System.out.println("����Գд����");
	}

}
class Student{
	
}
class ProgramStudent extends Student implements Programming, USB{

	@Override
	public void programming() {
		// TODO Auto-generated method stub
		System.out.println("���̵�Сѧ��");
	}

	@Override
	public void service() {
		// TODO Auto-generated method stub
		System.out.println("Сѧ��Ҳ����USB");
		
	}
	
}
