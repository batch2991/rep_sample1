

public class Array_ex 
{

	public static void main(String[] args) 
	{
		int n[ ]={23,45,67,89,20,34}; 
		
		for(int i=0;i<6;i++)
			System.out.println(n[i]);
		
		for(int i=0;i<n.length;i++)
			System.out.println(n[i]);
		
		for(int x : n)  // x will take each value in   n
			System.out.println(x);
		
		String str[ ]= {"hyd","blore","chennai","ponnur","delhi"};
		for(String x :str)
			System.out.println(x);
		}

	}

