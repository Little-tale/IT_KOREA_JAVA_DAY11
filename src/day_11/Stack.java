package day_11;

public class Stack
{	//메소드
	  // 반환값 타입 메소드명(타입 매개변수)
		static int addNum(int first,int second)
		{
			int result = first + second;
			return result;
		}
	
	public static void main(String[] args)
	{
	//필드
		int hello = addNum(10, 20);
		System.out.println(hello);
	
	}

}
