package day007;

class Student{
	String name="张浩";
	int age=10;
	String cl="S1班";
	String hobby="篮球";
	
}

class Teacher{
	String name = "王老师";
	int teachYear =5;
	String major = "计算机";
	void printClass(){
		System.out.println("使用Java语言理解程序逻辑");
	}
}

public class Test{
	public static void main(String[] args) {
		
		Student student = new Student();
		System.out.println(student.name);
		System.out.println("年龄:"+student.age);
		System.out.println("就读于:"+student.cl);
		System.out.println("爱好:"+student.hobby+"\n\n");
		Teacher teacher = new Teacher();
		System.out.println(teacher.name);
		System.out.println("专业方向:"+teacher.major);
		System.out.print("教授课程:");
		teacher.printClass();
		System.out.println("教龄:"+teacher.teachYear);
		
		
		
	}
}