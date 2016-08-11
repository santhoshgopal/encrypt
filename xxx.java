import java.io.*;
import java.util.*;
class xxx
{
	public static void main(String args[])
	{
		int temp,i,j;
		char ab='a';
		ArrayList<String>l=new ArrayList<String>();
		Scanner in=new Scanner(System.in);
		String as=in.nextLine();
		String[] a=as.split(" ");
		int len1=a.length;

for(j=0;j<len1;j++)
{

		char[]abcd=a[j].toCharArray();
		char[]abc=a[j].toCharArray();
		int len=a[j].length();
		for(int k=0;k<len;k++)
		abc[k]=Character.toLowerCase(abc[k]);
		for(i=0;i<=len-2;i++)
		{
			
			if(abc[i]>='a'&&abc[i]<='z')
			{
			temp=(int)abc[i]-(int)abc[len-1];
			if(temp<=0)
			temp=temp+26;
			
			while(temp>1)
			{
			ab++;
			temp--;	
			}
			abc[i]=ab;
			ab='a';
			temp=0;
			}
			
			
		}
for(int k=0;k<len;k++)
{
if(abcd[k]>='A'&&abcd[k]<='Z')
abc[k]=Character.toUpperCase(abc[k]);
}
String tempr=new String(abc);
l.add(tempr);
}
String te2=String.join(",",l);
System.out.println(te2);
	}
}