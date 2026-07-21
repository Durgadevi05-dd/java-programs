import java.util.Scanner;
public class taskspaceprogram
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
String str = sc.nextLine();
String result = "";
for (int i = 0; i < str.length(); i++)
{
char ch = str.charAt(i);
if (ch == '.') 
{
  result = result + " ";
}
else if (ch >= 'A' && ch <= 'X') 
{
  result = result + (char)(ch + 2);
}
else if (ch == 'Y') 
{
   result = result + 'A';
}
else if (ch == 'Z') 
{
   result = result + 'B';
}
else if (ch >= 'a' && ch <= 'x')
{
   result = result + (char)(ch + 2);
}
else if (ch == 'y') 
{
  result = result + 'a';
}
else if (ch == 'z') 
{
   result = result + 'b';
}
else 
{
  result = result + ch;
}
}
System.out.println(result);
}
}