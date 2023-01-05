package day_11;

public class heap {

	public static void main(String[] args)
	{
		/*
		 * int date = 23; String year = "2023Years";
		 */
		String year = "2023Years" ; //문자열을 저장하는 스티링도 참조값있다.
		
		
		int a [] = null;
		// 가변배열 선언
		
		// 스택영역에 할당
		System.out.println(a);

		// 힙 영역에 할당
		a = new int [3];
		// 힙 영역에 3개의 연속된 공간 할당 변수 a 에는 참조값이 할당된다.
		System.out.println(a); // 참조값 @74a10858
	}

}
