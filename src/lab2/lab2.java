package lab2;

import java.util.Scanner;

public class lab2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("20.а) видаляє всі слова, що мають подвоєні літери; б) підраховує кількість слів у тексті.\n введіть текст - ");
String text=in.nextLine();
char []ctext=text.toCharArray();
char []txt=new char[text.length()];
boolean f=false;
int y=0, l=0, kk=1;
for(int i=0;i<text.length();i++) 
{
char[] buff=new char[10];
try {
	while(ctext[i]!=
			' ') 
	{
		buff[y]+=ctext[i];
		if(i!=0) {
		if(ctext[i]==ctext[i-1])
			{
			f=true;
			}
		if(ctext[i-1]==' ')
			kk++;
		}
		y++;
		i++;
	}
	if(f==false) 
	{
		for(int k=0;k<y;k++)
		{
			txt[l]=buff[k];
			l++;
		}
		txt[l]=' ';
		l++;
	}
	y=0;
	f=false;}
catch(Exception ee) {}
}
System.out.print("а) ");
for(int i=0;i<l;i++) 
{
System.out.print(txt[i]);	
}
System.out.print("б)кількість слів у тексті -  "+kk);
	}

}
