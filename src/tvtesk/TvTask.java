package tvtesk;

import java.util.Scanner;

public class TvTask {

	public static void main(String[] args)
	{
		String msg = "1.전원버튼 \n"+"2.채널 올리기 \n"+"3.채널 내리기 \n" + "4. 입력 >> :";
		
		Scanner sc = new Scanner(System.in);
		BasicTv tv = new BasicTv("SpaceGrey",3_000_000, false, 17);
		
		int choiceChannel = 0;
		while(true)
		{
			System.out.println();
			System.out.println(msg);
			choiceChannel = sc.nextInt();
			
			switch(choiceChannel)
			{
			case 1:
				if(tv.power)
				{
					System.out.println("전원끄기!");
					tv.powerOnOff();
				}
				else 
				{
					System.out.println("전원켜기!");
					tv.powerOnOff();
				}
				break;
			case 2:
				if(tv.power)
				{
					System.out.println("채널 : "+ tv.channelUp());
				}
				break;
				
			case 3 :
				if(tv.power && tv.channel > 1)
				{
					System.out.println("채널 : "+ tv.channelDown());
					
				}
				break;
				
			}
			
			
			
			
			
		}
		

	}

}
