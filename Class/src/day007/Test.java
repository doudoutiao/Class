package day007;

class Student{
	String name="�ź�";
	int age=10;
	String cl="S1��";
	String hobby="����";
	
}

class Teacher{
	String name = "����ʦ";
	int teachYear =5;
	String major = "�����";
	void printClass(){
		System.out.println("ʹ��Java�����������߼�");
	}
}

public class Test{
	public static void main(String[] args) {
		
		Student student = new Student();
		System.out.println(student.name);
		System.out.println("����:"+student.age);
		System.out.println("�Ͷ���:"+student.cl);
		System.out.println("����:"+student.hobby+"\n\n");
		Teacher teacher = new Teacher();
		System.out.println(teacher.name);
		System.out.println("רҵ����:"+teacher.major);
		System.out.print("���ڿγ�:");
		teacher.printClass();
		System.out.println("����:"+teacher.teachYear);
		
		
		
	}
}