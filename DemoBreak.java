package app;

public class DemoBreak {
	public static void main(String aa[])
	{
		//int i
		for (int i=1; i<10; i++)
		{
			if(i==5)
			{
				break;// breaking the loop oput is = [1,2,3,4]
			//	continue;//it will skip the statement oput is = [1,2,3,4,5,6,7,8]
			}
			System.out.println(i);
		}
	}

}
