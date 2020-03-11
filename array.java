import java.util.*;
class program
{
public static void main(String args[])
{
	ArrayList <String> al=new ArrayList();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	String a[i]=new String();
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextLine();
	}
	for(int i=0;i<a.length();i++)
	{
	String S=a[i].Split(" ");
	int c=0;
	if(S.equals("get"))
	{
		c=1;
    }
    else if(S.equals("add"))
    {
		c=2;
		 }
else if(S.equals("count"))
{
	c=3;
}
else if(S.equals("remove"))
{
	c=4;
	}
	

	
	switch(c)
	{

		case 1:
		System.out.println(al.contains(a[i]));
		break;
		
		case 2:
		System.out.println(al.contains(a[i]==true));
		break;
		
		case 3:
		System.out.println(al.size());
		break;
		
		case 4:
		al.remove(0);
		System.out.println("remove all");
		break;
		
		default:
		System.out.println("null");
		break;
	}
}
}
	

	
	
}	