import java.util.Scanner;
public class str9
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
String rev="";
for(int i=str.length()-1;i>=0;i--)
{
rev = rev + str.charAt(i);
}
int flag = 1;
for(int i = 0; i < str.length(); i++)
{
if(str.charAt(i) != rev.charAt(i))
{
flag = 0;
break;
}
}
if(flag == 1)
   System.out.println("Palindrome");
else
   System.out.println("Not Palindrome");
}
}
