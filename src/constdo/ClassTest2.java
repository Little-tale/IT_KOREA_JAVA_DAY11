package constdo;

class B
{
	// 필드
	int num;
	// 메소드
	void printNum(int num)
	{
		System.out.println("num >>> "+this.num);
		System.out.println("num >>> "+num);
		System.out.println("참조값 >>> "+this);
		
	}
}







public class ClassTest2
{	
	
	public static void main(String[] args)
	{
		B b1 = new B();
		B b2 = new B();
		
		System.out.println(b1.num);
		b2.num = 10;
		b2.printNum(30);
	}

}
