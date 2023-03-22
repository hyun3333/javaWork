package Java_assignment.chap2.quiz01;

public class MainClass {
	
	public static void main(String[] args) {
		
		Student std = new Student();
		
		std.name = "고둘리";
		std.age = "8";
		std.studentld = "11-1111";
		
		std.sInfo();
		
		
		Teacher tch = new Teacher();
		
		tch.name = "고선생";
		tch.age = "40";
		tch.subject = "수학";
		
		tch.tInfo();
		
		
		Employee epl = new Employee();
		
		epl.name = "고길동";
		epl.age = "30";
		epl.departments = "영업부";
		
		epl.eInfo();
		
		
		
		
		
		
		
		
		
	}

}
