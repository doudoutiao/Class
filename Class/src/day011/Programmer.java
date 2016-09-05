package day011;

public class Programmer implements Programming {

	@Override
	public void programming() {
		
		System.out.println("程序猿写程序");
	}

}
class Student{
	
}
class ProgramStudent extends Student implements Programming, USB{

	@Override
	public void programming() {
		// TODO Auto-generated method stub
		System.out.println("会编程的小学生");
	}

	@Override
	public void service() {
		// TODO Auto-generated method stub
		System.out.println("小学生也会用USB");
		
	}
	
}
