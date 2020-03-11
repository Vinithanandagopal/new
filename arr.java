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
	String S=a[i].Split("");
	if(S.equals("get"))
	{
		n=1;
    }
    else if(S.equals("add"))
    {
		n=2;
		 }
else if(S.equals("count"))
{
	n=3;
}
else if(S.equals("remove"))
{
	n=4;
	}
	
	if(n==1)
	{
		System.out.println(al.contains(a[i]));
	}
	else if(n==2)
	{
		System.out.println(al.contains(a[i]=true));
	}
	else if(n==3)
	{
		System.out.println(al.size());
	}
	else if(n==4)
	{
		System.out.println("remove all");
	}
	else{
		System.out.println("null");
	}
}
}
}