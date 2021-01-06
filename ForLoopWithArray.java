package app;

public class ForLoopWithArray {
	
		// int num;
	//  ForLoopWithArray
	
	public static void main(String aa[])
	{
		int Num []={34,34,45,56,12};
		String name []= {"ram","op","singh","dev","abc", "mohan"};
		
		for(int n:Num)
		{
			System.out.print(n);
			if(n==12)
			{
				System.out.println(" ....");
			}
			else 
			{
				System.out.print(",");
			}
			
			//System.out.print(",");
			
		}
		
		System.out.print("\n");
		
		for(String nam : name)
		{
			System.out.print(nam);
			//System.out.print(",");
			//if(tea==tea)
			//{
				System.out.print(",");
			//}
			//else
			//{
				System.out.print("");
		//	}
			
		}
		
	}

}


/*  Output is

34,34,45,56,12 ....    is me mene (12) ke aage  (.....) lagaye he me iss ko string ke saatha kese kar sakte he..{ int me mene if & else aagya he..}

[//ram,op,singh,dev,abc,mohan,\\]   (,) mohan ke aage jo (,) ka symbol he usse sir kese hata sakte he.  { string me mujhe samjha nhi aarha he..} */       
