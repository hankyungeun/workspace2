package day03;

//import day02.Person;

//class Person {
//	int age;
//	public String name;
//	protected int height;
//	private int weight;
//	public void setWeight(int weight) {
//		this.weight = weight;
//	}
//}

class Person {
	public Person() {
	System.out.println( "Person 클래스의 생성자가 호출 되었습니다.");
	}
}

public class Student extends Person  {
	public Student() {
		System.out.println( "Student 클래스의 생성자가 호출 되었습니다.");
	}
//	public void set() {
////		age = 30;
//		name = "홍길동";
//		height = 175;
////		setHeight(99);
//		setWeight(100);

	public static void main(String[] args) {
		Person s = new Student();
//		s.set();
	}
}
