import java.util.*;
class PavansHauntedAdventure 
{
	public static void main(String[] args) 
	{
		int n=5; // number of friends excluding pavan                                                      
		int[] pavan=new int[n];
		
		// roll no.of.each friend
		pavan[0]=2;           
		pavan[1]=3;
		pavan[2]=15;
		pavan[3]=12;
		pavan[4]=21;

		Scanner input=new Scanner(System.in);
		System.out.println("Enter roll no to take attendance");
		int m=input.nextInt();                 // attendance taken for a friend having roll no 21.

		// Case 1:attendance taken for a friend having roll no 21
		int i;
		for (i=0;i<n ;i++ )                  
		{ 
			if(pavan[i]==m)
			{
				System.out.println("Friend having roll no "+m+" is present");
			}
			else
			{
				System.out.println("Friend having roll no "+m+" is not present");
			}
		}

		System.out.println();

        // Case 2:attendance taken for a friend having roll no 71
		System.out.println("Enter roll no to take attendance");
		int r=input.nextInt();                    // attendance taken for a friend having roll no 71.

		for (i=0;i<n ;i++ )                     
		{
			if(pavan[i]==r)
			{
				System.out.println("Friend having roll no "+r+" is present");
			}
			else
			{
				System.out.println("Friend having roll no "+r+" is not present");
			}
		}
	}
}
