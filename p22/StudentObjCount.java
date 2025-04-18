class Student{
	int rno;

	String name;
		
	static int count=0;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(int rno, String name) {
		super();
		Student.ObjCount();
		
		this.rno = rno;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Stduent [rno=" + rno + ", name=" + name + "]";
	}

	static void ObjCount()
	{
		count++;

		System.out.println("Object created :"+count);
		
	}
	
	
	public void display() {
		System.out.println("Student roll no:"+rno);

		System.out.println("Student name:"+name);
		 
	}
}
	
public class	StudentObjCount{
	public static void main(String a[])
	{
		Student student= new Student(101,"A");
	
		Student student2= new Student(102,"B");
		
		Student student3= new Student(103,"C");
		Student student4= new Student(104,"D");
		Student student5= new Student(105,"E");
		Student student6= new Student(105,"f");
	}
}

