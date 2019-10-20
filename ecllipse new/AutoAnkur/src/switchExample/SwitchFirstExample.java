package switchExample;

public class SwitchFirstExample 
{
	
	
	public static void main(String[] args)
	{
		int num = 2;
		switch(num)
		{
		case 1:
			System.out.println("First = "+num);
			break;
		case 2:
			System.out.println("Second ="+num);
			break;
		case 3:
			System.out.println("Third = "+num);
			break;
			
		default:
			System.out.println("Here is the default value");
		}
		
	}

}
